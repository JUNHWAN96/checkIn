package com.teamproject.checkin.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    //@Autowired  RequiredArgsConstructor
    //final이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
    final BoardService boardService;

    //기본부트스트랩
    @GetMapping("/freeBoard")
    public String FRboardList(Model model){
        List<BoardDto> list = boardService.BoardList();
        model.addAttribute("list",list);
        return "/board/freeBoard";
    }

    @GetMapping("/FRWrite")
    public String FRWrite(Model model){
        return "/board/FRWrite";
    }

    @PostMapping("/boardReg")
    public String boardReg(BoardDto boardDto){
        boardService.boardReg(boardDto);
        return "redirect:/freeBoard";
    }
    @GetMapping("/FRDetail")
    public String FRDetail(Model model){
        return "/board/FRDetail";
    }

    @GetMapping("/FREdit")
    public String FREdit(Model model){
        return "/board/FREdit";
    }

}
