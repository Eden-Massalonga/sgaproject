package mz.sgaspringapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Turma {

	@Id
	private int codigo;
	private String nome;
	
	public Turma() {
		
	}

	public Turma(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
		
}
