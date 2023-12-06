package com.example.jwt.config.jwt;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// login 요청해서 username, password 전송(post)하면 동작한다.
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        System.out.println("JwtAuthenticationFilter : 로그인 시도중");

        // 1. username, password 받아서

        // 2. 정상인지 로그인 시도를 해본다.
        // authenticationManager로 로그인 시도를 하면 PrincipalDetailService가 호출되고 loadUserByUsername()가 실행됨

        // 3. PrincipalDetails를 세션에 담는다.(권한 관리를 위해서)

        // 4. JWT 토큰을 만들어서 응답

        return super.attemptAuthentication(request, response);
    }
}
