package com.teamproject.checkin.boardService;

import lombok.Data;
import java.io.Serializable;

@Data
//복합키를 사용 할 수 있게  implements Serializable  임플리먼트
public class BoarderPK implements Serializable {
    private String corpCode;
    private String partCode;
    private String boardType;
    private Long boardNo;
}

