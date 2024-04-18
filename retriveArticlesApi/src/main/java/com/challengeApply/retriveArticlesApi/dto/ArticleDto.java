package com.challengeApply.retriveArticlesApi.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class ArticleDto {
    private Long id;
    private String tags;
    private String childrenString;
    private String author;
    private String commentText;
    private Date createdAt;
    private int createdAtId;
    private String objectID;
    private int parentId;
    private int storyId;
    private String story_title;
    private String story_url;
    private Date updatedAt;
    private int numComments;
    private int points;
    private String title;
    private String url;

    public ArticleDto(Long id, String tags, String childrenString, String author, String commentText, Date createdAt, int createdAtId, String objectID, int parentId, int storyId, String story_title, String story_url, Date updatedAt, int numComments, int points, String title, String url) {
        this.id = id;
        this.tags = tags;
        this.childrenString = childrenString;
        this.author = author;
        this.commentText = commentText;
        this.createdAt = createdAt;
        this.createdAtId = createdAtId;
        this.objectID = objectID;
        this.parentId = parentId;
        this.storyId = storyId;
        this.story_title = story_title;
        this.story_url = story_url;
        this.updatedAt = updatedAt;
        this.numComments = numComments;
        this.points = points;
        this.title = title;
        this.url = url;
    }
}
