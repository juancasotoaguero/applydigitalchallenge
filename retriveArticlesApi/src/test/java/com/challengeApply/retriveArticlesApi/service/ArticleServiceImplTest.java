package com.challengeApply.retriveArticlesApi.service;

import com.challengeApply.retriveArticlesApi.dto.ArticleDto;
import com.challengeApply.retriveArticlesApi.repository.ArticleRepository;
import com.challengeApply.retriveArticlesApi.service.impl.ArticleServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ArticleServiceImplTest {

    @InjectMocks
    private ArticleServiceImpl articleService;

    @Mock
    private ArticleRepository articleRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetArticlesByFilters() {
        // Mocking
        Page<ArticleDto> expectedPage = new PageImpl<>(Collections.emptyList());
        when(articleRepository.findByFiltersAndMonth(anyString(), anyString(), anyString(), anyInt(), any(Pageable.class)))
                .thenReturn(expectedPage);

        // Test
        Page<ArticleDto> result = articleService.getArticlesByFilters("author", "tags", "storyTitle", "January", Pageable.unpaged());

        // Verification
        verify(articleRepository, times(1)).findByFiltersAndMonth("author", "tags", "storyTitle", 1, Pageable.unpaged());
        assertEquals(expectedPage, result);
    }

    @Test
    public void testDeleteArticle() {
        String testObjectID = "testObjectID";

        // Test
        articleService.deleteArticle(testObjectID);

        // Verification
        verify(articleRepository, times(1)).updateArticle("N", testObjectID);
    }
}