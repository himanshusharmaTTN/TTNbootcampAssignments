package com.example.SpringSecurity.Config;

import com.example.SpringSecurity.model.CustomUserDetailService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;
    private final CustomUserDetailService service;

    public JwtFilter(JwtUtil jwtUtil, CustomUserDetailService service) {
        this.jwtUtil = jwtUtil;
        this.service = service;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest req,
            HttpServletResponse res,
            FilterChain chain) throws IOException, ServletException {

        String path = req.getServletPath();

        // 🔥 IMPORTANT: login/register skip
        if (path.startsWith("/auth")) {
            chain.doFilter(req, res);
            return;
        }

        String header = req.getHeader("Authorization");

        if (header != null && header.startsWith("Bearer ")) {
            String token = header.substring(7);
            String username = jwtUtil.extractUsername(token);

            UserDetails user = service.loadUserByUsername(username);

            UsernamePasswordAuthenticationToken auth =
                    new UsernamePasswordAuthenticationToken(
                            user, null, user.getAuthorities());

            SecurityContextHolder.getContext().setAuthentication(auth);
        }

        chain.doFilter(req,res);
    }
}
