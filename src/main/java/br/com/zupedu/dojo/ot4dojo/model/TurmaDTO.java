package br.com.zupedu.dojo.ot4dojo.model;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

public class TurmaDTO {
	//TODO: Validação nome único
	@NotBlank
	private String nome;

	//TODO: Validação iniciaEm antes de terminaEm
	private LocalDate iniciaEm;
	private LocalDate terminaEm;

	public String getNome() {
		return nome;
	}

	public LocalDate getIniciaEm() {
		return iniciaEm;
	}

	public LocalDate getTerminaEm() {
		return terminaEm;
	}

	@Override
	public String toString() {
		return "TurmaDTO{" +
				"nome='" + nome + '\'' +
				", iniciaEm=" + iniciaEm +
				", terminaEm=" + terminaEm +
				'}';
	}

	public Turma toModel(){
		return new Turma(this.nome,this.iniciaEm,this.terminaEm);
	}
}
