package br.edu.denis.entidade;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.edu.denis.validacao.EstadoCampos;
import br.edu.denis.validacao.NomeVizinhoCampos;

public class Vizinho{
	private String nome;
	
	//construtor
	public Vizinho(String nome){
		this.nome = nome;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
