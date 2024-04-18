package com.challengeApply.retriveArticlesApi.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ArticleTest {

    @Test
    public void testArticleEntity() {
        Article article = new Article();
        article.setId(1L);
        article.setAuthor("Test Author");
        article.setTags(Collections.singletonList("java,spring"));
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
        assertEquals(1L, article.getId());
        assertEquals("Test Author", article.getAuthor());
        assertEquals("java,spring", article.getTags());
        assertEquals("1,2,3", article.getChildrenString());
        article.setChildren(Arrays.asList(1,2,3));
        assertEquals("Test comment", article.getCommentText());
        assertNotNull(article.getCreatedAt());
        assertEquals(123, article.getCreatedAtId());
        assertEquals("testObjectID", article.getObjectID());
        assertEquals(456, article.getParentId());
        assertEquals(789, article.getStoryId());
        assertEquals("Test Story Title", article.getStory_title());
        assertEquals("http://testurl.com", article.getStory_url());
        assertNotNull(article.getUpdatedAt());
        assertEquals(10, article.getNumComments());
        assertEquals(100, article.getPoints());
        assertEquals("Test Title", article.getTitle());
        assertEquals("http://testurl.com", article.getUrl());
        assertEquals("A", article.getStatus());
        article.setTags(null);

    }
}