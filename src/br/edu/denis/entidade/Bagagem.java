package br.edu.denis.entidade;

public class Bagagem{
	//variaveis
	private String nome;
	
	//construtor
	public Bagagem() {//para dar serializable PRECISA TER UM CONSTRUTOR VAZIO
		
	}
	public Bagagem(String nome){
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
