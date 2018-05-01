package mz.sgaspringapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TurmaClasse {
	@Id
	private int codigo;
	
	private int ano;
	private int vagas;
	
	public TurmaClasse() {
		
	}

	public TurmaClasse(int ano, int vagas) {
		this.ano = ano;
		this.vagas = vagas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}	
	
}
