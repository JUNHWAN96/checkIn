package com.teamproject.checkin.board;

import com.teamproject.checkin.commEntity.TimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@IdClass(BoarderPK.class)
public class Board extends TimeEntity {

/*    @Id //@Pk
    private String corpCode;

    @Id
    private String partCode;*/
  //  @Id
    private String boardType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//자동으로 PK 값 입력이 됨 테스트 필요
    private Long boardNo;

    private String boardTitle;
    private String boardContent;
   // public Board() { }

    public Board(Long boardNo, String boardType, String boardTitle, String boardContent){
        this.boardNo = boardNo;
        this.boardType = boardType;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
    }
    public static Board of (Long boardNo, String boardType, String boardTitle, String boardContent)
    {
        return new Board(boardNo, boardType, boardTitle,boardContent);
    }

}
