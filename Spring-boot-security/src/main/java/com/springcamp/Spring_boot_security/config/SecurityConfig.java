package com.springcamp.Spring_boot_security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public AuthenticationProvider authProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

        provider.setUserDetailsService(userDetailsService);
        //provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        return provider;

    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        try {
            http
                    .csrf(customizer-> customizer.disable())
                    .authorizeHttpRequests(request-> request.anyRequest().authenticated())
                    .httpBasic(customizer -> Customizer.withDefaults())
                    .sessionManagement(session->
                            session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

            return http.build();
        }
        catch (Exception e){
            return (SecurityFilterChain) e;
        }
    }

    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails user = User
                .withDefaultPasswordEncoder()
                .username("slv9773")
                .password("1308")
                .roles("USER")
                .build();

        UserDetails admin = User
                .withDefaultPasswordEncoder()
                .username("admin")
                .password("1234")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user,admin);

    }


}
