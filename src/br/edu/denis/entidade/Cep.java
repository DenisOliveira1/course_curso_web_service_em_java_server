package br.edu.denis.entidade;


import java.util.LinkedList;
import java.util.List;

import javax.validation.Valid;

import br.edu.denis.validacao.EstadoCampos;

public class Cep{
	//variaveis
	private String cep;
	private String rua;
	private int numero;
	private String bairro;
	@EstadoCampos//tem que adicinar o @Valid no metodo que recebe cep, vai garantir que o objeto cep tenha esse campo valido
	private String estado;
	private List<Vizinho> vizinhos = new LinkedList<Vizinho>();//se nao inicializar da erro
	
	//construtor
	public Cep() {
		
	}
	
	public Cep(String cep, String rua, int numero, String bairro, String estado) {
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.estado = estado;
	}
	
	//getters e setters
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Vizinho> getVizinhos() {
		return vizinhos;
	}

	public void setVizinhos(List<Vizinho> vizinhos) {
		this.vizinhos = vizinhos;
	}

	public void addVizinho(Vizinho vizinho) {
		this.vizinhos.add(vizinho);
	}
	//metodos
	@Override
	public String toString() {
		return "Cep [cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", estado=" + estado
				+ "]";
	}

}
