package entidades;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.mysql.cj.xdevapi.Client;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class TrabalhoPersist {
    @Test
    @Transactional
    public void inserirTrabalho() {
        Trabalho trabalho = new Trabalho();
        trabalho.dataInicio = LocalDate.of(2025, 10, 17);
        trabalho.dataServico = LocalDate.of(2025, 10, 18);
        trabalho.horas = 8;
        trabalho.valor = 80.0;
        trabalho.empregada = Empregada.findById(1);
        trabalho.cliente = Cliente.findById(1);


        trabalho.persist();
        Assertions.assertEquals(6,trabalho.id);

    }
}
