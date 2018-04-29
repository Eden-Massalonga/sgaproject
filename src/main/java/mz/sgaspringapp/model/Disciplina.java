package mz.sgaspringapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplina {

	@Id
	private int codigo;
	private String descricao;
	
	public Disciplina() {
		
	}

	public Disciplina(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
		
}
