package com.challengeApply.retriveArticlesApi.controller;

import com.challengeApply.retriveArticlesApi.dto.ArticleDto;
import com.challengeApply.retriveArticlesApi.entity.Article;
import com.challengeApply.retriveArticlesApi.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public ResponseEntity<Page<ArticleDto>> getArticlesByFilters(
            @RequestParam(required = false) String author,
            @RequestParam(required = false) String tags,
            @RequestParam(required = false) String storyTitle,
            @RequestParam(required = false) String month,
            @RequestParam(defaultValue = "0") int page
    ) {
        Pageable pageable = PageRequest.of(page, 5);
        Page<ArticleDto> articles = articleService.getArticlesByFilters(author, tags, storyTitle, month, pageable);
        return ResponseEntity.ok(articles);
    }

    @DeleteMapping("/{objectID}")
    public ResponseEntity<Void> deleteArticle(@PathVariable String objectID) {
        articleService.deleteArticle(objectID);
        return ResponseEntity.noContent().build();
    }

}
