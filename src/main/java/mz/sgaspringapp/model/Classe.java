package mz.sgaspringapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classe {

	@Id
	private int codigo;
	private String descricao;
	
	public Classe() {
		
	}

	public Classe(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
		
}
