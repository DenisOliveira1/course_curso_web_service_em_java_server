package br.edu.denis.entidade;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.edu.denis.util.CorType;




@XmlRootElement//transforma em um elemento retornavel
@XmlAccessorType(XmlAccessType.FIELD)//base-a a consturcao do seu retorno em seus campos

public class Carro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//variaveis
	@XmlElement//poe @XmlElement so nos atributos que voce quer retornar no webservice
	private String nome;
	@XmlTransient//poe @XmlTransient nos atrbulos que nao quer retornar
	private String marca;
	@XmlElement
	private CorType cor;
	
	//construtor
	public Carro() {//para dar serializable precisa ter ao menos um construtor
		
	}
	
	public Carro(String nome, String marca, CorType cor) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public CorType getCor() {
		return cor;
	}
	public void setCor(CorType cor) {
		this.cor = cor;
	}
	
	
	

}
