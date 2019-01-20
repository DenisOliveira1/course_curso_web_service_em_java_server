package br.edu.denis.entidade;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.edu.denis.util.CorType;

@XmlRootElement//permite esse objeto ser retornado em formato xml tambem
@XmlAccessorType(XmlAccessType.FIELD)//base-a a consturcao do seu retorno em seus campos
public class Carro{
	//variaveis
	@XmlElement(name="nome1")//poe @XmlElement para alterar o nome do atributo
	private String nome;
	@XmlTransient//poe @XmlTransient nos atributos que nao quer retornar
	private String marca;
	private CorType cor;
	private List<Bagagem> bagagens =  new LinkedList<Bagagem>();//se nao inicializar da erro
	
	//construtor
	public Carro() {//para dar serializable PRECISA TER UM CONSTRUTOR VAZIO
		
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

	public List<Bagagem> getBagagens() {
		return bagagens;
	}

	public void setBagagens(List<Bagagem> bagagem) {
		this.bagagens = bagagens;
	}
	public void addBagagens(Bagagem bagagem) {
		this.bagagens.add(bagagem);
	}


}
