package mz.sgaspringapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mz.sgaspringapp.model.Classe;
import mz.sgaspringapp.model.Disciplina;
import mz.sgaspringapp.service.CadastroService;
import mz.sgaspringapp.service.DisciplinaService;

@Controller
public class CadastroController {
	
	@Autowired
	CadastroService cSer;
	
	@Autowired
	DisciplinaService dSer;

	
	//Inicio do Cadastro da Classe
		@RequestMapping(method = RequestMethod.GET, value = "/classe")
		public String cadastroClasse() {
			return "cadastro/classe";
		}
		
		@RequestMapping(method = RequestMethod.POST, value = "/classe")
		public String cadastrarClasse(Classe classe) {
			
			cSer.cadastraClasse(classe);
			
			return "cadastro/classe";
		}
	//Fim do Cadastro da Classe
	
	
	//Fim do Cadastro da Disciplina
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
	
	
	
		@RequestMapping("/turma")
		public String cadastroTurma() {
			return "cadastro/turma";
		}
		
		@RequestMapping("/professor")
		public String cadastroProfessor() {
			return "cadastro/professor";
		}
		
		@RequestMapping("/secretaria")
		public String cadastroSecretaria() {
			return "cadastro/secretaria";
	}
}
