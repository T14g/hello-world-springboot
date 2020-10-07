package io.github.t14g;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Anotations obrigatórias
@Target(ElementType.TYPE) // SÓ É ELEGÍVEL PARA CLASSES, SÓ PODE SER INSERIDA EM CLASSES
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@Development
public @interface Development {
}
