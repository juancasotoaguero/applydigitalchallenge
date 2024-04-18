package com.challengeApply.retriveArticlesApi.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HighlightResult {
    public Author author;
    public CommentText comment_text;
    public StoryTitle story_title;
    public StoryUrl story_url;
    public Title title;
    public Url url;
}
