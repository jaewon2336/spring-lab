package site.metacoding.third;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // 파일을 리턴하는 컨트롤러
public class PostController {

    @GetMapping("/post/writeForm")
    public String writeForm() {
        // /resources/templates/{리턴값}.mustache 뷰 리졸버 설정
        return "post/writeForm"; // 파일경로(ViewResolver 설정 - mustache 라이브러리 다운로드 시)
    }

    // POST 메서드로 요청 -> http://localhost:8080/post
    // title=제목1&content=내용1 -> x-www-form-urlencoded 타입!
    // 스프링 기본 파싱 전략 -> x-www-form-urlencoded만 파싱
    @PostMapping("/post")
    public String write(String title, String content, Model model) {
        // 1. title, content DB에 INSERT하기
        System.out.println("title : " + title);
        System.out.println("content : " + content);

        // 2. 데이터 담아가기
        model.addAttribute("title", title);

        // 3. 글 목록 페이지로 이동
        return "post/list";
    }
}
