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
public class AlgoliaResponse {
    public Exhaustive exhaustive;
    public boolean exhaustiveNbHits;
    public boolean exhaustiveTypo;
    public List<Hit> hits;
    public int hitsPerPage;
    public int nbHits;
    public int nbPages;
    public int page;
    public String params;
    public int processingTimeMS;
    public ProcessingTimingsMS processingTimingsMS;
    public String query;
    public int serverTimeMS;

}
