package site.metacoding.dbtest.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import site.metacoding.dbtest.domain.boardTbl.BoardTbl;
import site.metacoding.dbtest.domain.boardTbl.BoardTblRepository;

@RequiredArgsConstructor
@Controller
public class BoardTblController {

    private final BoardTblRepository boardTblRepository;

    @GetMapping("/search")
    public String search(Model model, @RequestParam(defaultValue = "") String keyword) { // keyword=스프링

        List<BoardTbl> boards = boardTblRepository.mSearch(keyword);
        model.addAttribute("boards", boards);

        return "home";
    }
}
