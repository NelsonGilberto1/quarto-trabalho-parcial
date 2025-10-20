package entidades;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class EmpregadaPersist {
    @Test
    @Transactional
    public void cadastrarEmpregada(){
        Empregada empregada = new Empregada();

        empregada.nome = "Ana maria";
        empregada.email = "AnaMaria@gmail.com";
        empregada.telefone = "(14) 991234567";
        empregada.endereco = "Rua tatu bola numero 67";
        empregada.descricao = "Profissional especializada em limpezas pesadas e em jardinagem ";
        empregada.dataNascimento = LocalDate.of(1998, 2, 23);
        empregada.dataCadastro = LocalDate.now();
        empregada.sstatus = true;

        empregada.persist();
        Assertions.assertEquals(6,empregada.id);
    }
}
