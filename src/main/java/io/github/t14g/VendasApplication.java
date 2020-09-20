package io.github.t14g;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//Por padrão mesmo sem essa anotation todos os pacotes já são escaneados
@ComponentScan(basePackages = {
        "package io.github.t14g.repository",
        "package io.github.t14g.service",
        "com.umabiblioteca.projeto"
})
@RestController //Tornara a classe um controllador rest

//Convenção Classe que inicializa + sufixo Application
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName") // o que quero injetar na variável abaixo
    private String applicationName;

    //Mapeia a url /hello da aplicação e mostra a mensagem Hello World
    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        //Incializa a aplicação springboot
        SpringApplication.run(VendasApplication.class, args);
    }
}
