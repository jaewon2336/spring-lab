package site.metacoding.second.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 모델
@AllArgsConstructor
@Getter
@Setter
public class Post {
    private int id;
    private String title;
    private String content;
}
