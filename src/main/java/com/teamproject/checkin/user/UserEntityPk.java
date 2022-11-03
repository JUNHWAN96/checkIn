package com.teamproject.checkin.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntityPk implements Serializable {

    private String corpCode;
    private String partCode;
    private Long employeeNo;
    private String userId;

}
