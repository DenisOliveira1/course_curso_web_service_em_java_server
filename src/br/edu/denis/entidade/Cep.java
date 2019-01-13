package br.edu.denis.entidade;

import java.io.Serializable;

public class Cep implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//variaveis
	private String cep;
	private String rua;
	private int numero;
	private String bairro;
	private String estado;
	
	//construtor
	public Cep() {
		
	}
	
	public Cep(String cep, String rua, int numero, String bairro, String estado) {
		super();
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//metodos
	@Override
	public String toString() {
		return "Cep [cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", estado=" + estado
				+ "]";
	}

}
