package com.challengeApply.retriveArticlesApi.mapper;

import com.challengeApply.retriveArticlesApi.dto.ArticleDto;
import com.challengeApply.retriveArticlesApi.entity.Article;
import com.challengeApply.retriveArticlesApi.mapper.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class ArticleMapperTest {

    @Test
    public void testMapToArticleDto() {
        Article article = new Article();
        article.setId(1L);
        article.setAuthor("Test Author");
        article.setTags(Arrays.asList("java","spring"));
        article.setChildrenString("1,2,3");
        article.setCommentText("Test comment");
        article.setCreatedAt(new Date());
        article.setCreatedAtId(123);
        article.setObjectID("testObjectID");
        article.setParentId(456);
        article.setStoryId(789);
        article.setStory_title("Test Story Title");
        article.setStory_url("http://testurl.com");
        article.setUpdatedAt(new Date());
        article.setNumComments(10);
        article.setPoints(100);
        article.setTitle("Test Title");
        article.setUrl("http://testurl.com");
        article.setStatus("A");

        List<Article> articles = Arrays.asList(article);


        List<ArticleDto> articleDtos = ArticleMapper.mapToArticleDto(articles);
        assertNotNull(articleDtos);
        assertEquals(1, articleDtos.size());

        ArticleDto mappedArticle = articleDtos.get(0);
        //assertEquals(article.getId(), mappedArticle.getId());
        assertEquals(article.getAuthor(), mappedArticle.getAuthor());
        assertEquals(article.getTags(), mappedArticle.getTags());
        assertEquals(article.getChildrenString(), mappedArticle.getChildrenString());
        assertEquals(article.getCommentText(), mappedArticle.getCommentText());
        assertEquals(article.getCreatedAt(), mappedArticle.getCreatedAt());
        assertEquals(article.getCreatedAtId(), mappedArticle.getCreatedAtId());
        assertEquals(article.getObjectID(), mappedArticle.getObjectID());
        assertEquals(article.getParentId(), mappedArticle.getParentId());
        assertEquals(article.getStoryId(), mappedArticle.getStoryId());
        assertEquals(article.getStory_title(), mappedArticle.getStory_title());
        assertEquals(article.getStory_url(), mappedArticle.getStory_url());
        assertEquals(article.getUpdatedAt(), mappedArticle.getUpdatedAt());
        assertEquals(article.getNumComments(), mappedArticle.getNumComments());
        assertEquals(article.getPoints(), mappedArticle.getPoints());
        assertEquals(article.getTitle(), mappedArticle.getTitle());
        assertEquals(article.getUrl(), mappedArticle.getUrl());
    }
}