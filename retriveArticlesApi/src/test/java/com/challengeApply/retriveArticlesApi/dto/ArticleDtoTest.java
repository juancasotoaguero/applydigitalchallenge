package com.challengeApply.retriveArticlesApi.dto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ArticleDtoTest {

    @Test
    public void testArticleDtoConstructor() {
        Date createdAt = new Date();
        Date updatedAt = new Date();

        ArticleDto articleDto = new ArticleDto(1L, "java,spring", "1,2,3", "John Doe", "Sample comment",
                createdAt, 123456, "object123", 0, 0, "Sample Story", "http://sampleurl.com",
                updatedAt, 5, 10, "Sample Title", "http://samplearticle.com");

        assertEquals(1L, articleDto.getId());
        assertEquals("java,spring", articleDto.getTags());
        assertEquals("1,2,3", articleDto.getChildrenString());
        assertEquals("John Doe", articleDto.getAuthor());
        assertEquals("Sample comment", articleDto.getCommentText());
        assertEquals(createdAt, articleDto.getCreatedAt());
        assertEquals(123456, articleDto.getCreatedAtId());
        assertEquals("object123", articleDto.getObjectID());
        assertEquals(0, articleDto.getParentId());
        assertEquals(0, articleDto.getStoryId());
        assertEquals("Sample Story", articleDto.getStory_title());
        assertEquals("http://sampleurl.com", articleDto.getStory_url());
        assertEquals(updatedAt, articleDto.getUpdatedAt());
        assertEquals(5, articleDto.getNumComments());
        assertEquals(10, articleDto.getPoints());
        assertEquals("Sample Title", articleDto.getTitle());
        assertEquals("http://samplearticle.com", articleDto.getUrl());
    }

    @Test
    public void testArticleDtoDefaultConstructor() {
        ArticleDto articleDto = new ArticleDto();

        assertNull(articleDto.getId());
        assertNull(articleDto.getTags());
        assertNull(articleDto.getChildrenString());
        assertNull(articleDto.getAuthor());
        assertNull(articleDto.getCommentText());
        assertNull(articleDto.getCreatedAt());
        assertEquals(0, articleDto.getCreatedAtId());
        assertNull(articleDto.getObjectID());
        assertEquals(0, articleDto.getParentId());
        assertEquals(0, articleDto.getStoryId());
        assertNull(articleDto.getStory_title());
        assertNull(articleDto.getStory_url());
        assertNull(articleDto.getUpdatedAt());
        assertEquals(0, articleDto.getNumComments());
        assertEquals(0, articleDto.getPoints());
        assertNull(articleDto.getTitle());
        assertNull(articleDto.getUrl());
    }
}