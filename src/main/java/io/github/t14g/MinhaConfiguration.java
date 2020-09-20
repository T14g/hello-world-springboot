package io.github.t14g;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Classes com esse @ são escaneadas pelo springboot
//Bean é um objeto no contexto da aplicação
@Configuration
public class MinhaConfiguration {

    @Bean
    public String applicationName() {
        return "Sistema de vendas";
    }
}
