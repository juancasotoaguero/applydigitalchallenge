package com.challengeApply.retriveArticlesApi.repository;

import com.challengeApply.retriveArticlesApi.dto.ArticleDto;
import com.challengeApply.retriveArticlesApi.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Query("SELECT new com.challengeApply.retriveArticlesApi.dto.ArticleDto(a.id, " +
            "a.tags, a.childrenString, a.author, a.commentText, a.createdAt, a.createdAtId, " +
            "a.objectID, a.parentId, a.storyId, a.story_title, a.story_url, a.updatedAt, " +
            "a.numComments, a.points, a.title, a.url)" +
            "FROM Article a " +
            "WHERE (:author IS NULL OR a.author LIKE %:author%) " +
            "AND (:tags IS NULL OR a.tags LIKE %:tags%) " +
            "AND (:story_title IS NULL OR a.story_title LIKE %:story_title%) " +
            "AND (:month IS NULL OR EXTRACT(MONTH FROM a.createdAt) = :month)"+
            "AND a.status LIKE 'A'")
    Page<ArticleDto> findByFiltersAndMonth(String author, String tags, String story_title, Integer month, Pageable pageable);


    @Modifying
    @Query("UPDATE Article a SET a.status = :status WHERE a.objectID = :objectID")
    void updateArticle(String status, String objectID);

}
