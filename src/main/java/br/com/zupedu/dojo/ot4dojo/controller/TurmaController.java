package br.com.zupedu.dojo.ot4dojo.controller;

import br.com.zupedu.dojo.ot4dojo.model.Turma;
import br.com.zupedu.dojo.ot4dojo.model.TurmaDTO;
import br.com.zupedu.dojo.ot4dojo.repository.TurmaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/turmas")
public class TurmaController {
	private Logger logger = LoggerFactory.getLogger(TurmaController.class);
	
	private TurmaRepository repository;
	
	@Autowired
	TurmaController(TurmaRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping(value = "/cadastrar")
	public ResponseEntity<?> cadastrar(@RequestBody @Valid TurmaDTO dto, UriComponentsBuilder builder) {
		logger.info("Chegou no método cadastrar");
		Turma turma = dto.toModel();

		Optional<Turma> turmaOptionalNome = repository.findByNome(turma.getNome());
		Optional<Turma> turmaOptionalIniciaEm = repository.findByIniciaEm(turma.getIniciaEm());
		
		if (turmaOptionalNome.isPresent() || turmaOptionalIniciaEm.isPresent() ) {
			return ResponseEntity.badRequest().build();
		}
		
		repository.save(turma);
		return ResponseEntity.created(builder
				.path("/turma/{id}").buildAndExpand(turma.getId()).toUri()).body(turma);
	}

}
