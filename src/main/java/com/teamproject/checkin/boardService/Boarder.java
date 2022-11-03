package com.teamproject.checkin.boardService;

import javax.persistence.*;

@Entity
@IdClass(BoarderPK.class)
public class Boarder {

    @Id //@Pk
    private String corpCode;

    @Id
    private String partCode;

    @Id
    private String boardType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//자동으로 PK 값 입력이 됨 테스트 필요
    private Long boardNo;

    private String boardTitle;
    private String boardContent;

}
