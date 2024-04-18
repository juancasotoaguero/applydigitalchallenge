package com.challengeApply.retriveArticlesApi.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tags", columnDefinition = "TEXT")
    private String tags;
    @Column(name = "children", columnDefinition = "TEXT")
    private String childrenString;
    @Column(name = "author", columnDefinition = "TEXT")
    private String author;
    @Column(name = "comment_text", columnDefinition = "TEXT")
    private String commentText;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "created_at_i")
    private int createdAtId;
    @Column(name = "object_id")
    private String objectID;
    @Column(name = "parent_id", columnDefinition = "TEXT")
    private int parentId;
    @Column(name = "story_id", columnDefinition = "TEXT")
    private int storyId;
    @Column(name = "storyTitle", columnDefinition = "TEXT")
    private String story_title;
    @Column(name = "storyUrl", columnDefinition = "TEXT")
    private String story_url;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "num_comments")
    private int numComments;
    @Column(name = "points")
    private int points;
    @Column(name = "title", columnDefinition = "TEXT")
    private String title;
    @Column(name = "url", columnDefinition = "TEXT")
    private String url;
    @Column(name = "status")//only change the status, when the register its deleted
    private String status;

    public void setTags(List<String> tags) {
        if(tags !=null)
            this.tags = String.join(",", tags);
    }


    public void setChildren(List<Integer> children) {
        if (children != null)
            this.childrenString = children.stream().map(String::valueOf).collect(Collectors.joining(","));

    }
}
