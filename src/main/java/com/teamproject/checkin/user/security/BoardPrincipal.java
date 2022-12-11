package com.teamproject.checkin.user.security;

import com.teamproject.checkin.user.UserAccountDto;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

// 시큐리티가 /login 주소 요청이 오면 낚아채서 로그인 진행
// 로그인 진행이 완료가 되면 session을 만들어 준다. (Security ContextHolder)
// 오브젝트 타입 => Authentication 타입 객체
// Authentication 안에 User 정보가 있어야 한다.
// User 오브젝트타입 => UserDetails 타입 객체
@Getter
public class BoardPrincipal implements UserDetails {

    private String userId;
    private String name;
    private String password;
    private String pastPassword;
    private Long wrongCount;
    private String role;
    private String email;
    private String phoneNo;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Collection<GrantedAuthority> collect = new ArrayList<>(); // String으로 반환 할 수 없기 떄문에 담아줌

        collect.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return String.valueOf(role);
            }
        });
        return collect;
    }

    @Override public String getPassword() {return password;}

    @Override public String getUsername() {return userId;}

    @Override public boolean isAccountNonExpired() { return true;}

    @Override public boolean isAccountNonLocked() { return true;}

    @Override public boolean isCredentialsNonExpired() { return true;}

    @Override public boolean isEnabled() { return true;}

    //팩토리 메소드

    public static BoardPrincipal of(String userId, String name, String password, String pastPassword, Long wrongCount
            ,String role, String email, String phoneNo)
    {
        return new BoardPrincipal(userId,name,password,pastPassword,wrongCount,role,email,phoneNo);
    }

    public BoardPrincipal(String userId, String name, String password, String pastPassword, Long wrongCount
            , String role, String email, String phoneNo) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.pastPassword = pastPassword;
        this.wrongCount = wrongCount;
        this.role = role;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public static BoardPrincipal from(UserAccountDto dto){
        return BoardPrincipal.of(
                dto.getUserId(),
                dto.getName(),
                dto.getPassword(),
                dto.getPastPassword(),
                dto.getWrongCount(),
                dto.getRole(),
                dto.getEmail(),
                dto.getPhoneNo()
        );
    }

    public UserAccountDto toDto(){
        return UserAccountDto.of(
                userId,
                name,
                password,
                pastPassword,
                wrongCount,
                role,
                email,
                phoneNo
        );
    }

}
