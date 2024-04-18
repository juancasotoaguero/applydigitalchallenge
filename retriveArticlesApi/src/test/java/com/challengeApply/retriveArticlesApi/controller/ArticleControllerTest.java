package com.challengeApply.retriveArticlesApi.controller;

import com.challengeApply.retriveArticlesApi.dto.ArticleDto;
import com.challengeApply.retriveArticlesApi.service.ArticleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ArticleControllerTest {

    @Mock
    private ArticleService articleService;

    private ArticleController articleController;

    @BeforeEach
    public void setUp() {
        articleController = new ArticleController(articleService);
    }

    @Test
    public void testGetArticlesByFilters() throws Exception {
        List<ArticleDto> articleDtoList = new ArrayList<>();
        articleDtoList.add(new ArticleDto(123L, "23", "123", "123", "123", null, 12, "", 12, 12, "Title", "http://localhost:8080/alskd", null, 001, 12, null, null));

        Page<ArticleDto> articleDtoPage = new PageImpl<>(articleDtoList, PageRequest.of(0, 5), articleDtoList.size());

        when(articleService.getArticlesByFilters(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.any()))
                .thenReturn(articleDtoPage);

        Page<ArticleDto> result = articleController.getArticlesByFilters("testAuthor", "testTag", "testTitle", "testMonth", 0).getBody();

        assertNotNull(result);
        assertEquals(1, result.getContent().size());
    }

    @Test
    public void testDeleteArticle() {
        String testObjectID = "testObjectID";

        articleController.deleteArticle(testObjectID);

        verify(articleService, times(1)).deleteArticle(testObjectID);
    }
}