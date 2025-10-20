package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entidades.Avaliacao;
import entidades.Cliente;
import entidades.Empregada;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class AvaliacaoPersist {
    @Test
    @Transactional
    public void criarAvaliacao(){
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.nota = 6;
        avaliacao.comentarios = "A Ana foi muito profissional, recomendo muito!";
        avaliacao.dataAvaliacao = java.time.LocalDateTime.now();
        avaliacao.empregada = Empregada.findById(1);
        avaliacao.cliente = Cliente.findById(1);

        avaliacao.persist();

        Assertions.assertEquals(6, avaliacao.id);
    }
}
