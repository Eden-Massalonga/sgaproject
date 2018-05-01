package mz.sgaspringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.sgaspringapp.model.Classe;
import mz.sgaspringapp.repository.ClasseRepository;

@Service
public class ClasseService {
	
	@Autowired
	private ClasseRepository cR;
	

	//Cadastro de Classe	
	public void cadastraClasse(Classe classe) {
		cR.save(classe);
	}
}
