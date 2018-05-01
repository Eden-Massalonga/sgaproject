package mz.sgaspringapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mz.sgaspringapp.model.Disciplina;
import mz.sgaspringapp.service.DisciplinaService;

@Controller
public class DisciplinaController {
	
	@Autowired
	private DisciplinaService dSer;
	
	//Inicio do Cadastro da Disciplina
		@RequestMapping(method = RequestMethod.GET, value = "/disciplina")
		public String cadastroDisciplina() {		
				
			return "cadastro/disciplina";
		}
			
		@RequestMapping(method = RequestMethod.POST, value = "/disciplina")
		public String cadastrarDisciplina(Disciplina disciplina) {
				
			dSer.cadastraDisciplina(disciplina);
				
			return "cadastro/disciplina";
		}
	//Fim do Cadastro da Disciplina
}
