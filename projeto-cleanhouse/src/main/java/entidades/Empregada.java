package entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empregada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String nome;
    public String email;
    public String telefone;
    public String endereco;
    public String descricao;
    public LocalDate dataNascimento;
    public LocalDate dataCadastro;
    public Boolean sstatus;
}
