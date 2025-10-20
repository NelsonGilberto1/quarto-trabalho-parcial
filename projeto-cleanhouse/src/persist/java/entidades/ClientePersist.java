package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class ClientePersist {
    @test
    @Transactional

    public void cadastrarCliente(){
        Cliente cliente = new Cliente();
        cliente.nome = "Antonio";
        cliente.cpf = "123.456.789 - 11";
        cliente.email = "AntonioSilva@gmail.com";
        cliente.telefone = "(14) 123456789";
        cliente.endereco = "Rua tamandua bandeira numero 14";

        cliente.persist();
        Assertions.assertEquals(6, cliente.id);
    }
}
