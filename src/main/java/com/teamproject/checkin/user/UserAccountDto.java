package com.teamproject.checkin.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAccountDto {
    private String userId;
    private String name;
    private String password;
    private String pastPassword;
    private Long wrongCount;
    private String role;
    private String email;
    private String phoneNo;

    // 팩토리 메소드
    public static UserAccountDto of( String userId, String name, String password, String pastPassword
                                    ,Long wrongCount, String role, String email, String phoneNo)
    {
        return new UserAccountDto( userId, name, password, pastPassword ,wrongCount, role, email, phoneNo);
    }

    public UserAccountDto( String userId, String name, String password, String pastPassword, Long wrongCount
                           , String role, String email, String phoneNo)
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

    //Dto를 entity로 변환

    public UserAccount toEntity(){
        return UserAccount.of(userId,name,password,pastPassword,wrongCount,role,email,phoneNo);
    }

    // entity를 dto로 변환
    public static UserAccountDto fromEntity(UserAccount entity){
        return new UserAccountDto(
                entity.getUserId(),
                entity.getName(),
                entity.getPassword(),
                entity.getPastPassword(),
                entity.getWrongCount(),
                entity.getRole(),
                entity.getEmail(),
                entity.getPhoneNo()
        );
    }

}
