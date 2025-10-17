package com.flipkart.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable() // disable CSRF for testing
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/products/**").permitAll() // allow product endpoints
                .anyRequest().authenticated()
            )
            .httpBasic(); // for simplicity

        return http.build();
    }
}
