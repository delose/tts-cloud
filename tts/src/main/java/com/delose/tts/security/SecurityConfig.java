package com.delose.tts.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // in memory user store
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
        auth.inMemoryAuthentication()
                .withUser("user1")
                .password("user1")
                .authorities("ROLE_USER")
                .and()
                .withUser("user2")
                .password("user2")
                .authorities("ROLE_USER");

    }
}
