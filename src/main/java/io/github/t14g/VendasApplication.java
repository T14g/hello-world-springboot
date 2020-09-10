package io.github.t14g;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //Tornara a classe um controllador rest

//Convenção Classe que inicializa + sufixo Application
public class VendasApplication {

    //Mapeia a url /hello da aplicação e mostra a mensagem Hello World
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    public static void main(String[] args) {
        //Incializa a aplicação springboot
        SpringApplication.run(VendasApplication.class, args);
    }
}
