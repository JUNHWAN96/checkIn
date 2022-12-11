package com.teamproject.checkin.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Getter
@Entity
public class UserAccount {

    @Id
    @Column(length = 30, name = "userId")
    private String userId;

    @Setter @Column(nullable = false) private String name;

    @Setter @Column(nullable = false, length = 1000) private String password;

    @Setter @Column(length = 1000, name="pastPassword") private String pastPassword;

    @Setter @Column(length = 1) private Long wrongCount;

    @Setter @Column private String role;

    @Setter @Column private String email;

    @Setter @Column private String phoneNo;

    protected UserAccount() {}
    public UserAccount(String userId, String name, String password, String pastPassword
                    , Long wrongCount, String role, String email, String phoneNo)
    {

        this.userId = userId;
        this.name = name;
        this.password = password;
        this.pastPassword = pastPassword;
        this.wrongCount = wrongCount;
        this.role = role;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public static UserAccount of (String userId, String name, String password, String pastPassword
            , Long wrongCount, String role, String email, String phoneNo)
    {
        return new UserAccount(userId, name, password,pastPassword, wrongCount, role, email, phoneNo);
    }
}
