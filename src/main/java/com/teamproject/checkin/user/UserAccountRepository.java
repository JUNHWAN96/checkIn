package com.teamproject.checkin.user;

import com.teamproject.checkin.user.security.BoardPrincipal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {

    Optional<UserAccount> findByUserId(String userId);
}
