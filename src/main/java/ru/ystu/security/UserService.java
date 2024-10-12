package ru.ystu.security;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.ystu.domain.security.User;

public interface UserService {
    UserDetailsService userDetailsService();
    User getCurrentUser();
    User getByUsername(String username);
    User create(User user);
    User findByUsername(String username);
    User save(User user);
}
