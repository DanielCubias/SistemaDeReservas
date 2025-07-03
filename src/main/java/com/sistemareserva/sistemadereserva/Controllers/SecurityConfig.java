package com.sistemareserva.sistemadereserva.Controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

        // Spring utiliza este para construir el sistema de seguridad de mi app
        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

                http
                                .authorizeHttpRequests(auth -> auth
                                                .requestMatchers("/indexStyle.css/**", "/style.css/**", "/js/**",
                                                                "/login")
                                                .permitAll()
                                                .anyRequest().authenticated())
                                .formLogin(form -> form
                                                .loginPage("/login") // muestra mi login personalizado
                                                .defaultSuccessUrl("/index", true) // Redirige a index tras login
                                                                                   // exitoso
                                                .permitAll())
                                .logout(logout -> logout
                                                .logoutSuccessUrl("/login?logout")// Tras cerrar sesión, redirige a
                                                                                  // login
                                                .permitAll());

                return http.build();
        }

}
