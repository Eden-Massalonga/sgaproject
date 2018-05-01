package mz.sgaspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TurmaController {
	
	@RequestMapping("/turma")
	public String cadastroTurma() {
		return "cadastro/turma";
	}
}
