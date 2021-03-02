package org.generation.minhaLojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table
public class Usuario {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
		
	@NotNull
	@Size (min=5, max=100)
	private String nome;
	
	@NotNull
	@Size (min=5, max=100)
	private double idade;
	
	@NotNull
	@Size (min=11, max=100)
	private double cpf;
	
	@NotNull
	@Size (min=5, max=100)
	private String sexo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
	
	