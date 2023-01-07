//package com.teamproject.checkin.board;
//
//import lombok.Data;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.io.Serializable;
//
//@Data
////복합키를 사용 할 수 있게  implements Serializable  임플리먼트
//public class BoarderPK implements Serializable {
//    private String corpCode;
//    private String partCode;
//    private String boardType;
//
//
//    //@Id pk 적용 ,     @GeneratedValue(strategy = GenerationType.IDENTITY) 시퀀스 값으로 유지
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long boardNo;
//}
//
