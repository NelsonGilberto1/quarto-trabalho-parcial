package entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String mensagem;
    public LocalDate dataMensagem;
    public Boolean status;
    @ManyToOne
    public Cliente cliente;
    @ManyToOne
    public Empregada empregada;
    @ManyToOne
    public Trabalho trabalho;
}
