package br.com.jonatas.springsecurity;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityWebConfig extends WebSecurityConfigurerAdapter {
   
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
            // Para qualquer requisição (anyRequest) é preciso estar
            // autenticado (authenticated).
            .anyRequest().authenticated()
        .and()
        .httpBasic();
  }

 @Override
  public void configure(AuthenticationManagerBuilder builder) throws Exception {
    builder
        .inMemoryAuthentication()
        .withUser("jonatas").password("{noop}123")
            .roles("USER")
        .and()
        .withUser("veloso").password("{noop}123")
            .roles("USER");
  }

 
}
