package com.challengeApply.retriveArticlesApi.service;

import com.challengeApply.retriveArticlesApi.dto.ArticleDto;
import com.challengeApply.retriveArticlesApi.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ArticleService {

    public Page<ArticleDto> getArticlesByFilters(String author, String tags, String storyTitle, String month, Pageable pageable);

    public void deleteArticle(String objectID);
}
