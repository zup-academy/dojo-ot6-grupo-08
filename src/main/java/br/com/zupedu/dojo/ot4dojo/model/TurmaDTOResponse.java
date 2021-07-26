package br.com.zupedu.dojo.ot4dojo.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class TurmaDTOResponse {
    private Long id;
    private String nome;
    private LocalDate iniciaEm;
    private LocalDate terminaEm;


    public TurmaDTOResponse(Long id, String nome, LocalDate iniciaEm, LocalDate terminaEm) {
        this.id = id;
        this.nome = nome;
        this.iniciaEm = iniciaEm;
        this.terminaEm = terminaEm;
    }
}
