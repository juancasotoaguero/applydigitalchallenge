package com.challengeApply.retriveArticlesApi.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StoryUrl {
    public String matchLevel;
    public List<String> matchedWords;
    public String value;
    public boolean fullyHighlighted;
}
