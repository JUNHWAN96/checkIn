package com.teamproject.checkin.board;

import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Board boardReg(BoardDto dto){
        return boardRepository.save(dto.toEntity());
    }
}
