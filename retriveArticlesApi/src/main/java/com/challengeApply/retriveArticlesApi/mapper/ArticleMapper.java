package com.challengeApply.retriveArticlesApi.mapper;

import com.challengeApply.retriveArticlesApi.dto.ArticleDto;
import com.challengeApply.retriveArticlesApi.entity.Article;

import java.util.List;
import java.util.stream.Collectors;

public class ArticleMapper {

    public static List<ArticleDto> mapToArticleDto(List<Article> articles){
        List<ArticleDto> articlesDto = null;
        if (articles != null) {
            articlesDto = articles.stream()
                    .map(article -> {
                        ArticleDto articleDto = new ArticleDto();
                        articleDto.setAuthor(article.getAuthor());
                        articleDto.setChildrenString(article.getChildrenString());
                        articleDto.setObjectID(article.getObjectID());
                        articleDto.setTitle(article.getTitle());
                        articleDto.setCreatedAt(article.getCreatedAt());
                        articleDto.setCommentText(article.getCommentText());
                        articleDto.setCreatedAtId(article.getCreatedAtId());
                        articleDto.setNumComments(article.getNumComments());
                        articleDto.setParentId(article.getParentId());
                        articleDto.setPoints(article.getPoints());
                        articleDto.setStory_title(article.getStory_title());
                        articleDto.setStory_url(article.getStory_url());
                        articleDto.setStoryId(article.getStoryId());
                        articleDto.setTags(article.getTags());
                        articleDto.setUpdatedAt(article.getUpdatedAt());
                        articleDto.setUrl(article.getUrl());
                        return articleDto;
                    })
                    .toList();
        }
        return articlesDto;
    }

}
