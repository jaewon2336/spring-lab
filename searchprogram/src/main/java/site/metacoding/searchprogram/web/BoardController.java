package site.metacoding.searchprogram.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import site.metacoding.searchprogram.domain.BoardTblRepository;

@RequiredArgsConstructor
@Controller
public class BoardController {

    private final BoardTblRepository boardTblRepository;

    @GetMapping({ "/", "/list" })
    public String boardList(@RequestParam(defaultValue = "") String keyword, Model model) {

        // System.out.println("===========*" + keyword + "*===========");

        // List<BoardTbl> boards = boardTblRepository.mSearch(keyword);
        // List<BoardTbl> boardsSelect = boardTblRepository.findAll();

        model.addAttribute("boards", boardTblRepository.mSearch(keyword));
        // model.addAttribute("boards", boardTblRepository.findAll());

        // System.out.println("boards 리스트 : " + boards);

        // model.addAttribute("boards", boards);
        // model.addAttribute("boardsSelect", boardsSelect);

        return "list";
    }

}
