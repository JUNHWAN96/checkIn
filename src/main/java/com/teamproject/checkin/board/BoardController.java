package com.teamproject.checkin.board;

import com.teamproject.checkin.board.BoardDto;
import com.teamproject.checkin.board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    //기본부트스트랩
    @GetMapping("/freeBoard")
    public String FRboardList(Model model){
        return "/board/freeBoard";
    }
    
    @GetMapping("/FRWrite")
    public String FRWrite(Model model){
        return "/board/FRWrite";
    }

    @PostMapping("/boardReg")
    public String boardReg(BoardDto boardDto){


        System.out.printf("boardDto");
        System.out.printf(boardDto.toString());

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
