package com.teamproject.checkin.user;

import com.teamproject.checkin.user.security.BoardPrincipal;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@RequiredArgsConstructor
@Service
public class UserAccountService implements UserDetailsService {

    private final UserAccountRepository userAccountRepository;
    private final BCryptPasswordEncoder encoder;

    @Transactional
    public UserAccount saveUser(UserAccountDto dto) {
        dto.setPassword(encoder.encode(dto.getPassword()));
        return userAccountRepository.save(dto.toEntity());
    }


    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {

        BoardPrincipal boardPrincipal = userAccountRepository.findByUserId(userId)
                .map(UserAccountDto ::fromEntity)
                .map(BoardPrincipal::from)
                .orElseThrow(() -> new UsernameNotFoundException("해당사용자가 존재하지 않습니다:" + userId));

        return boardPrincipal ;
    }
}
