package io.github.t14g;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//Classes com esse @ são escaneadas pelo springboot
//Bean é um objeto no contexto da aplicação
@Configuration
@Development
public class MinhaConfiguration {

   @Bean
    public CommandLineRunner executar(){//Recebe argumentos e roda
       return args -> {
           System.out.println("Rodando a config de Desenvolvimento");
       };
   }
}
