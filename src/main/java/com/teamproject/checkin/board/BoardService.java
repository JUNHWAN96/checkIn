package com.teamproject.checkin.board;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;


    public List<BoardDto> BoardList(){
        List<Board> boards= boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<BoardDto>();

        for(Board board : boards){
            boardDtoList.add(BoardDto.fromEntity(board));
        }
        return boardDtoList;
    }

    public Board boardReg(BoardDto dto){
        return boardRepository.save(dto.toEntity());
    }
}
