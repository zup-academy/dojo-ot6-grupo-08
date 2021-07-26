package br.com.zupedu.dojo.ot4dojo.model;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

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
}
