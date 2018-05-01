package mz.sgaspringapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mz.sgaspringapp.model.Turma;
import mz.sgaspringapp.service.TurmaService;

@Controller
public class TurmaController {
	
	@Autowired
	TurmaService tSer;
	
	@RequestMapping(method = RequestMethod.GET, value = "/turma")
	public String cadastroTurma() {
		return "cadastro/turma";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/turma")
	public String adicionarTurma(Turma turma) {
		tSer.cadastraTurma(turma);
		
		return "cadastro/turma";
	}
}
