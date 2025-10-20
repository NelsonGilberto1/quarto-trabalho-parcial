package entidades;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class PagamentoPersist {
    @Test
    @Transactional
    public void inserirPagamento(){
        Pagamento pagamento = new Pagamento();
        pagamento.valor = 79.99;
        pagamento.metodo = "Pix";
        pagamento.datas = LocalDate.of(2025, 10, 15);
        pagamento.comprovante = "liwuhgdi725";
        pagamento.trabalho = Trabalho.findById(1);

        pagamento.persist();

        Assertions.assertEquals(6,pagamento.id);
    }
}
