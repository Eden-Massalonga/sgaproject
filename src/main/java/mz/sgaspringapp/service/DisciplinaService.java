package mz.sgaspringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.sgaspringapp.model.Disciplina;
import mz.sgaspringapp.repository.DisciplinaRepository;

@Service
public class DisciplinaService {

	@Autowired
	private DisciplinaRepository dR;
	
	//Cadastro de Disciplina
		public void cadastraDisciplina(Disciplina disciplina) {
			dR.save(disciplina);
		}
		
}
