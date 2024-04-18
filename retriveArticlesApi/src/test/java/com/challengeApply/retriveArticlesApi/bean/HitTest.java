package com.challengeApply.retriveArticlesApi.bean;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class HitTest {

    @Test
    public void testGettersAndSetters() {
        // Given
        HighlightResult highlightResult = new HighlightResult();
        List<String> tags = Arrays.asList("tag1", "tag2");
        List<Integer> children = Arrays.asList(1, 2, 3);
        Date createdAt = new Date(System.currentTimeMillis());
        Date updatedAt = new Date(System.currentTimeMillis());

        // When
        Hit hit = new Hit();
        hit.set_highlightResult(highlightResult);
        hit.set_tags(tags);
        hit.setAuthor("author");
        hit.setComment_text("comment");
        hit.setCreated_at(createdAt);
        hit.setCreated_at_i(123456);
        hit.setObjectID("objectId");
        hit.setParent_id(1);
        hit.setStory_id(2);
        hit.setStory_title("title");
        hit.setStory_url("url");
        hit.setUpdated_at(updatedAt);
        hit.setChildren(children);
        hit.setNum_comments(10);
        hit.setPoints(100);
        hit.setTitle("title");
        hit.setUrl("url");

        // Then
        assertThat(hit.get_highlightResult()).isEqualTo(highlightResult);
        assertThat(hit.get_tags()).isEqualTo(tags);
        assertThat(hit.getAuthor()).isEqualTo("author");
        assertThat(hit.getComment_text()).isEqualTo("comment");
        assertThat(hit.getCreated_at()).isEqualTo(createdAt);
        assertThat(hit.getCreated_at_i()).isEqualTo(123456);
        assertThat(hit.getObjectID()).isEqualTo("objectId");
        assertThat(hit.getParent_id()).isEqualTo(1);
        assertThat(hit.getStory_id()).isEqualTo(2);
        assertThat(hit.getStory_title()).isEqualTo("title");
        assertThat(hit.getStory_url()).isEqualTo("url");
        assertThat(hit.getUpdated_at()).isEqualTo(updatedAt);
        assertThat(hit.getChildren()).isEqualTo(children);
        assertThat(hit.getNum_comments()).isEqualTo(10);
        assertThat(hit.getPoints()).isEqualTo(100);
        assertThat(hit.getTitle()).isEqualTo("title");
        assertThat(hit.getUrl()).isEqualTo("url");
    }
}