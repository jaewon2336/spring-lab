package site.metacoding.second.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 데이터 리턴 컨트롤러
public class SecondController {

    // 데이터베이스 second 테이블 생성됨

    // 주세요 Read - SELECT
    @GetMapping("/user") // user테이블의 모든 정보를 Get 주세요 -> 쿼리문 완성
    // 주소가 같아도 http 메서드로 분기하기 때문에 다른 요청으로 인식!
    public String test1() {
        return "<h1>test1</h1>";
    }

    // 줄게요 Create - INSERT
    @PostMapping("/user")
    public String test2() {
        return "<h1>test2</h1>";
    }

    // 수정해주세요 Update - UPDATE
    @PutMapping("/user")
    public String test3() {
        return "<h1>test3</h1>";
    }

    // 삭제해주세요 Delete - DELETE
    @DeleteMapping("/user")
    public String test4() {
        return "<h1>test4</h1>";
    }
}
