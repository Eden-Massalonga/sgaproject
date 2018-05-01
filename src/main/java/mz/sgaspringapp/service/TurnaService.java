package mz.sgaspringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.sgaspringapp.model.Turma;
import mz.sgaspringapp.repository.TurmaRepository;

@Service
public class TurnaService {

	@Autowired
	private TurmaRepository tR;
	
	public void cadastraTurma(Turma turma) {
		tR.save(turma);
	}
}
