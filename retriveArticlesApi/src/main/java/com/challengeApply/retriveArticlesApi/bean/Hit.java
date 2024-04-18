package com.challengeApply.retriveArticlesApi.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hit {
    public HighlightResult _highlightResult;
    public List<String> _tags;
    public String author;
    public String comment_text;
    public Date created_at;
    public int created_at_i;
    public String objectID;
    public int parent_id;
    public int story_id;
    public String story_title;
    public String story_url;
    public Date updated_at;
    public List<Integer> children;
    public int num_comments;
    public int points;
    public String title;
    public String url;

}