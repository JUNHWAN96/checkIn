package com.teamproject.checkin.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Getter
@Entity
@IdClass(UserEntityPk.class)
public class UserAccount {

    @Id
    private String corpCode;
    @Id
    private String partCode;
    @Id
    private Long employeeNo;
    @Id
    private String userId;

    @Setter @Column(nullable = false) private String name;

    @Setter @Column(nullable = false, length = 1000) private String password;

    @Setter @Column(length = 1000) private String pastPassword;

    @Setter @Column(length = 1) private Long wrongCount;

    @Setter @Column private String position;

    @Setter @Column private String joinDate;

    @Setter @Column private String retirementDate;

    @Setter @Column private String retirementYN;

    @Setter @Column private String email;

    @Setter @Column private String phoneNo;

    protected UserAccount() {}
    public UserAccount(String corpCode, String partCode, Long employeeNo
                    , String userId, String name, String password, String pastPassword
                    , Long wrongCount, String position, String joinDate, String retirementDate
                    , String retirementYN, String email, String phoneNo)
    {
        this.corpCode = corpCode;
        this.partCode = partCode;
        this.employeeNo = employeeNo;
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.pastPassword = pastPassword;
        this.wrongCount = wrongCount;
        this.position = position;
        this.joinDate = joinDate;
        this.retirementDate = retirementDate;
        this.retirementYN = retirementYN;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public static UserAccount of (String corpCode, String partCode, Long employeeNo
            , String userId, String name, String password, String pastPassword
            , Long wrongCount, String position, String joinDate, String retirementDate
            , String retirementYN, String email, String phoneNo)
    {
        return new UserAccount(corpCode, partCode, employeeNo, userId, name, password
                               ,pastPassword, wrongCount, position, joinDate, retirementDate
                               , retirementYN, email, phoneNo);
    }
}
