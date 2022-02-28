package site.metacoding.second.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostApiController {

    // 주세요 Read - SELECT
    // SELECT * FROM post WHERE id = ?
    // 구체적으로 뭘 달라고 요청 - body X
    @GetMapping("/post/{id}") // post 뒤에 있는 숫자는 무조건 PK, 고정된 값이 아닌 동적으로 받고싶을 때 PathVariable
                              // 이건 DS가 다 만들어줌
    public String test1(@PathVariable int id) {
        // 1번 게시글 주세요
        return "주세요 id : " + id;
    }

    // SELECT * FROM post WHERE title = ?
    // PK가 아닌 것은 쿼리 스트링으로 받음
    // http://localhost:8000/post?title=?
    @GetMapping("/post") // PK가 아니라 WHERE절에 username, password가 들어오는 것
    public String search(String title) { // DS : 매개변수에 뭐가 있네? 아 쿼리 스트링이 있다는거네? 파싱해줄게!
        // title이 ~인 것 찾아 주세요
        return "주세요 title : " + title;
    }

    // 줄게요 Create - INSERT
    // 뭘 줘야 함 - body O
    // http:localhost:8000/post 요청하면 전송되는 내용(아래)
    // body : title=제목1&content=내용1
    // header : Content-Type:application/x-www-form-urlencoded -> 쿼리스트링, form태그로
    // 들어오는 데이터
    // request.getParameter() 메서드가 스프링 기본 파싱 전략
    // -> x-www-form-urlencoded 타입만 파싱 가능
    @PostMapping("/post")
    public String test2(String title, String content) {
        // 제목, 내용 줄게요
        return "줄게요 : title : " + title + ", content : " + content;
    }

    // 수정해주세요 Update - UPDATE
    // 뭘 줘야 함 - body O
    // UPDATE post SET title = ?, content = ? WHERE id = ?
    // 협업을 하기 위해 API 문서 필요
    @PutMapping("/post/{id}") // WHERE절의 조건은 주소에, 변경할 데이터는 body에 (규칙)
    public String test3(String title, String content, @PathVariable int id) {
        // title, content (primary key : id) 수정
        return "수정해주세요 : title : " + title + ", content : " + content + ", id : " + id;
    }

    // 삭제해주세요 Delete - DELETE
    // 구체적으로 삭제해주세요 - body X
    // 구체적인 id는 주소로 요청
    // DELETE from post WHERE id = ?

    // 만약 http://localhost:8000/post?title=제목1
    // DELETE from post WHERE title = ?
    // title은 PK가 아니니까 WHERE에 있어도 쿼리 스트링
    // 키값이 필요없기때문에 주소에 쓸 수 있는것
    @DeleteMapping("/post/{id}")
    public String test4(@PathVariable int id) {
        return "삭제해주세요 id : " + id;
    }
}
