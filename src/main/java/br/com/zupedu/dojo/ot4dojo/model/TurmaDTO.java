package br.com.zupedu.dojo.ot4dojo.model;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

public class TurmaDTO {
	
	@NotBlank
	private String nome;
	@Future
	private LocalDate iniciaEm;
	@Future
	private LocalDate terminaEm;

}
