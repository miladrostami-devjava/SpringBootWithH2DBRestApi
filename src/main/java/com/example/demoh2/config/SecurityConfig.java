package com.example.demoh2.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

return httpSecurity
        .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))
        //step2
        .authorizeRequests(auth -> auth
                //step6
                .requestMatchers("/h2-console/**").permitAll()
                //step3
                .requestMatchers("/api/books").permitAll()

//step4
                .anyRequest().authenticated() )
//step7
        .headers(header -> header.frameOptions().sameOrigin())
        //step5
        .httpBasic(Customizer.withDefaults())
        //step1
        .build();
    }

}
