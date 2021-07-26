package br.com.zupedu.dojo.ot4dojo.model;

import java.time.LocalDate;

public class TurmaDTOResponse {
    private Long id;
    private String nome;
    private LocalDate iniciaEm;
    private LocalDate terminaEm;


    public TurmaDTOResponse(Turma turma) {
        this.id = turma.getId();
        this.nome = turma.getNome();
        this.iniciaEm = turma.getIniciaEm();
        this.terminaEm = turma.getTerminaEm();
    }


	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public LocalDate getIniciaEm() {
		return iniciaEm;
	}


	public LocalDate getTerminaEm() {
		return terminaEm;
	}
    
    
}
