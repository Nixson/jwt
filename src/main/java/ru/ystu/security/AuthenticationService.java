package ru.ystu.security;

import ru.ystu.controller.dto.JwtAuthenticationResponse;
import ru.ystu.controller.dto.SignInRequest;
import ru.ystu.controller.dto.SignUpRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signUp(SignUpRequest request);

    JwtAuthenticationResponse signIn(SignInRequest request);
}
