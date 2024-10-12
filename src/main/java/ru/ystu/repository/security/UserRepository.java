package ru.ystu.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ystu.domain.security.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
