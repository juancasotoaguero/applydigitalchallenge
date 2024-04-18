package com.challengeApply.retriveArticlesApi.service.impl;

import com.challengeApply.retriveArticlesApi.dto.ArticleDto;
import com.challengeApply.retriveArticlesApi.entity.Article;
import com.challengeApply.retriveArticlesApi.mapper.ArticleMapper;
import com.challengeApply.retriveArticlesApi.repository.ArticleRepository;
import com.challengeApply.retriveArticlesApi.service.ArticleService;
import com.challengeApply.retriveArticlesApi.utils.Utils;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

    public static final String STATUS_DELETED = "N";
    private  ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Page<ArticleDto> getArticlesByFilters(String author, String tags, String storyTitle,  String month, Pageable pageable) {
        Integer monthNumeric = null;
        if (month != null) {
            monthNumeric = Utils.getMonthNumber(month);
        }
        return articleRepository.findByFiltersAndMonth(
                author, tags, storyTitle,
                monthNumeric, pageable
        );
    }

    @Override
    public void deleteArticle(String objectID) {
        articleRepository.updateArticle(STATUS_DELETED, objectID);
    }
}
