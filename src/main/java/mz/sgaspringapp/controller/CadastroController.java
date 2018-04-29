package mz.sgaspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroController {

	@RequestMapping("/classe")
	public String cadastroClasse() {
		return "cadastro/classe";
	}
	
	@RequestMapping("/disciplina")
	public String cadastroDisciplina() {
		return "cadastro/disciplina";
	}
	
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
