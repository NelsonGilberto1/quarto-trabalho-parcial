package entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Trabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public LocalDate dataInicio;
    public LocalDate dataServico;
    public Integer horas;
    public Double valor;
    @ManyToOne
    public Empregada empregada;
    @ManyToOne
    public Cliente cliente;
}
