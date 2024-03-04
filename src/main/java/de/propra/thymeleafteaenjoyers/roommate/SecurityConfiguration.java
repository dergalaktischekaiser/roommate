package de.propra.thymeleafteaenjoyers.roommate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
    /*@Bean
    public SecurityFilterChain configure(HttpSecurity chainBuilder) throws Exception {
        chainBuilder.authorizeHttpRequests(
                configurer -> configurer.requestMatchers("/").permitAll()
                        .anyRequest().authenticated()
        ).formLogin(Customizer.withDefaults()).oauth2Login(Customizer.withDefaults());
        return chainBuilder.build();
    }*/
    @Bean
    public SecurityFilterChain configure(HttpSecurity chainBuilder) throws Exception {
        chainBuilder.authorizeHttpRequests(
                configurer -> configurer.requestMatchers("/").permitAll()
                                        .requestMatchers("/rick_astley").hasRole("ADMIN")
                                        .anyRequest().authenticated()
        ).oauth2Login(config ->
                config.userInfoEndpoint(
                info -> info.userService(new AppUserService())
        ));
        return chainBuilder.build();
    }
}