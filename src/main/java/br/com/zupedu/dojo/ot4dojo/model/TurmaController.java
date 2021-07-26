package br.com.zupedu.dojo.ot4dojo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/turma")
public class TurmaController {
	
	private TurmaRepository repository;
	
	@Autowired
	TurmaController(TurmaRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping(value = "/cadastrar")
	public void cadastrar(@RequestBody Turma turma) {
		
	}

}
