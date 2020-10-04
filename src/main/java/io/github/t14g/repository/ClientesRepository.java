package io.github.t14g.repository;

import io.github.t14g.model.Cliente;
import org.springframework.stereotype.Repository;

//Significa que vai acessar a base de dados
//Será adicionada ao container de injeção por ter a notation @Repository estão pronta
//Para ser injetada onde for necessário
//E já está sendo escaneado pelo container
//
@Repository
public class ClientesRepository {

    //acessa a base e salva o cliente
    public void persistir(Cliente cliente) {
    }
}
