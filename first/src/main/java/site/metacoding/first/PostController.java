package site.metacoding.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 파일을 리턴함
// RequestDispatcher dis = request.getRequestDispatcher("파일명");
// dis.forward(request, response);
@Controller
public class PostController {

    @GetMapping("/imgTest")
    public String imgTest() {
        return "imgTest";
    }

    @GetMapping("/writeForm")
    public String writeForm() {

        return "writeForm";
        // 글자를 리턴하는게 아닌 파일을 리턴함 -> 템플릿(뷰)이 필요!
    }

    @GetMapping("/updateForm")
    public String updateForm() {

        return "updateForm";
    }
}
