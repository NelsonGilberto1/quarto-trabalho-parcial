package entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Avaliacao {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer id;
    public Float nota;
    public String comentarios;
    public LocalDate dataAvaliacao;
    @ManyToOne
    public Empregada empregada;
    @ManyToOne
    public Cliente cliente;
}
