package com.saintrivers.demokotlin.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.web.servlet.invoke
import org.springframework.security.web.SecurityFilterChain

@EnableWebSecurity
@Configuration
class SecurityConfig {

    @Bean
    fun springSecurityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http {
            cors {}
            csrf { disable() }
            authorizeRequests {
                authorize("/api/v1/books", authenticated)
            }
            httpBasic {  }
        }
        return http.build()
    }

//    @Bean
//    fun springSecurityFilterChain(httpSecurity: HttpSecurity): SecurityFilterChain{
//        return httpSecurity
//            .authorizeRequests()
//            .antMatchers("/").permitAll()
//            .antMatchers("/login").permitAll()
//            .antMatchers("/h2-console/**").permitAll()
//            .antMatchers("/api/**").permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .formLogin()
//            .and()
//            .csrf().disable()
//            .headers().frameOptions().disable()
//            .and()
//            .logout()
//            .logoutSuccessUrl("/")
//            .and()
//            .build()
//    }
}