package com.challengeApply.retriveArticlesApi.utils;

import com.challengeApply.retriveArticlesApi.bean.AlgoliaResponse;
import com.challengeApply.retriveArticlesApi.entity.Article;
import com.challengeApply.retriveArticlesApi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class AlgoliaService {

    @Value("${algolia.api.endpoint}")
    private String algoliaEndpoint;

    private final ArticleRepository articleRepository;

    public AlgoliaService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Scheduled(fixedRate = 3600000) // call algoria api every (3600000 milisegundos)
    public void fetchArticlesFromAlgolia() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<AlgoliaResponse> response = restTemplate.exchange(
                algoliaEndpoint,
                HttpMethod.GET,
                null,
                AlgoliaResponse.class
        );

        System.out.println(Objects.requireNonNull(response.getBody()).toString());

        if (response.getStatusCode() == HttpStatus.OK) {
            AlgoliaResponse responseBody = response.getBody();
            List<Article> articles = null;
            if (responseBody != null) {
                articles = responseBody.getHits().stream()
                        .map(hit -> {
                            Article article = new Article();
                            article.setAuthor(hit.getAuthor());
                            article.setChildren(hit.getChildren());
                            article.setObjectID(hit.getObjectID());
                            article.setTitle(hit.getTitle());
                            article.setCreatedAt(hit.getCreated_at());
                            article.setCommentText(hit.getComment_text());
                            article.setCreatedAtId(hit.getCreated_at_i());
                            article.setNumComments(hit.getNum_comments());
                            article.setParentId(hit.getParent_id());
                            article.setPoints(hit.getPoints());
                            article.setStory_title(hit.getStory_title());
                            article.setStory_url(hit.getStory_url());
                            article.setStoryId(hit.getStory_id());
                            article.setTags(hit.get_tags());
                            article.setUpdatedAt(hit.getUpdated_at());
                            article.setUrl(hit.getUrl());
                            article.setStatus("A");
                            return article;
                        })
                        .collect(Collectors.toList());
            }

            // get the current articles
            List<String> existingObjectIDs = articleRepository.findAll().stream()
                    .map(Article::getObjectID)
                    .toList();
            // filter only new articles
            if (articles != null) {
                articles = articles.stream()
                        .filter(article -> !existingObjectIDs.contains(article.getObjectID()))
                        .collect(Collectors.toList());
            }
            System.out.println("New articles");
            System.out.println(articles);

            if (articles != null) {
                articleRepository.saveAll(articles);
            }
        } else {
            System.err.println("Error fetching articles from Algolia: " + response.getStatusCode());
        }
    }
}
