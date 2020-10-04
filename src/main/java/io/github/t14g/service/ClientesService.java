package io.github.t14g.service;
import io.github.t14g.model.Cliente;
//Cliente repository é uma dependência do cliente service
import io.github.t14g.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Regra de negócios e validações, relatórios e tem objeto que acessa a base de dados
//Acessa o clientesRepository
//Como é classe de negócio é necessário validar antes de salvar o cliente
//Fazer muitas conexões com a base de dados pode estourar a base de ados(warn)
//Uma conexão com base é complexa, pesada, bem pesadas as vezes
@Service
public class ClientesService {

    //Também pode ser feito sem construtor a injeção
    //Referência, variável de instância
    private ClientesRepository repository;

    //Constructor para injetar a dependência, via construtor adiciona a dependência repository
    //@Autowired vai tentar criar a instância mas antes vai verificar se já uma instância do repository
    //para ser injetada, e como há um @Repository ele vai instanciar para você e injetar onde for necessário
    //Evitando um assim um instânciamento direto


    @Autowired
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    //Aplica validações
    public void validarCliente(Cliente cliente){

    }
}
