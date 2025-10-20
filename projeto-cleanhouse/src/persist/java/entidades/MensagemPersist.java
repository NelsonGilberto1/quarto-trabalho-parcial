package entidades;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class MensagemPersist {
    @Test
    @Transactional
    public voi enviarMensagem(){
        Mensagem mensagens = new Mensagem();
        mensagens.mensagem = "Bom dia. gostaria de saber quando você fica livre para um trabalho?";
        mensagens.dataMensagem = LocalDate.now();
        mensagens.sstatus = false;
        mensagens.cliente = Cliente.findById(1);
        mensagens.empregada = Empregada.findById(1);

        mensagens.persist();

        Assertions.assertEquals(6,mensagens.id);
    }    
}
