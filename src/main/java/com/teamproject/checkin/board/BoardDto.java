package com.teamproject.checkin.board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BoardDto {

    private Long boardNo;
    private String boardType;
    private String boardTitle;
    private String boardContent;
    private LocalDateTime insDate;
    private LocalDateTime updDate;



    public BoardDto(Long boardNo, String boardType, String boardTitle, String boardContent,LocalDateTime insDate,LocalDateTime updDate) {
        this.boardNo = boardNo;
        this.boardType = boardType;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.insDate = insDate;
        this.updDate = updDate;

    }

    public Board toEntity(){
        return  Board.of(boardNo, boardType, boardTitle,boardContent);
    }

    // entity를 dto로 변환
    public static BoardDto fromEntity(Board entity){
        return new BoardDto(
                entity.getBoardNo(),
                entity.getBoardType(),
                entity.getBoardTitle(),
                entity.getBoardContent(),
                entity.getInsDate(),
                entity.getUpdDate()
        );
    }
}
