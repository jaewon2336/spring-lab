package site.metacoding.first;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// UserController u = new UserController(); 와 같다.
// Data를 리턴하는 컨트롤러 (PrintWriter로 리턴함)
@RestController // 성을 만들면서 컴포넌트 스캔을 한다.
public class UserController {

    Dog d;

    public UserController(Dog d, HttpServletRequest request) {
        // 진짜 마법처럼 new 되는지 확인
        System.out.println("UserController 생성자 실행됨");
        this.d = d;
    }

    @GetMapping("/home")
    public void home() {
        System.out.println("home~~~~~~~~~~");
    }

    @GetMapping("/bye")
    public void bye() {
        System.out.println("bye~~~~~~~~~~~");
    }
}
