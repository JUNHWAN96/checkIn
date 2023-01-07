package com.teamproject.checkin.board;

import com.teamproject.checkin.user.UserAccount;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {

    private Long boardNo;
    private String boardType;
    private String boardTitle;
    private String boardContent;

    public BoardDto(Long boardNo, String boardType, String boardTitle, String boardContent) {
        this.boardNo = boardNo;
        this.boardType = boardType;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
    }

    public Board toEntity(){
        return  Board.of(boardNo, boardType, boardTitle,boardContent);
    }
}
