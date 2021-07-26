package br.com.zupedu.dojo.ot4dojo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

@Entity
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Length(max = 50)
	@Column(unique = true, nullable = false)
	private String nome;
	private LocalDate iniciaEm;
	private LocalDate terminaEm;

	public Turma() {
	}

	public Turma(@Length(max = 50) String nome, LocalDate iniciaEm, LocalDate terminaEm) {
		super();
		this.nome = nome;
		this.iniciaEm = iniciaEm;
		this.terminaEm = terminaEm;
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
