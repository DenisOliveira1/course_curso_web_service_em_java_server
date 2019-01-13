package br.edu.denis.soap;

import java.util.LinkedList;

/**
 * Enquanto o rest tem é baseado na url e no metodo o soap envia claramente o que quer em sua solicitacao,
 * sendo assim mais burocratico e pesado, nao necessitando depender de parametros da url. 
 */

import java.util.List;
import java.util.Random;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.sun.istack.NotNull;

import br.edu.denis.entidade.Carro;
import br.edu.denis.util.CorType;

@WebService
public class SoapService {
	
	@WebMethod//vale para todos da pagina
	public String ping(@WebParam(name = "nome")@NotNull String nome) {//da um nome para a variavel no xml de requisicao e resposta, se nao ficaria arg0, arg1...
		return "Pong! "+nome;
	}
	
	@WebMethod(operationName = "getIdade1")//da outro nome par ao metodo no xml de requisicao e resposta
	public int getIdade() {
		return new Random().nextInt(20);
	}
	
	public List<String> geLista(){
		List<String> toReturn = new LinkedList<String>();
		toReturn.add("item 1");
		toReturn.add("item 2");
		toReturn.add("item 3");
		return toReturn;
	}
	
	public List<Carro> getCarros(){
		List<Carro> toReturn = new LinkedList<Carro>();
		toReturn.add(new Carro("carro 1","fiat", CorType.BRANCO));
		toReturn.add(new Carro("carro 2","ford", CorType.MARROM));
		toReturn.add(new Carro("carro 3","renault", CorType.ROSA));
		return toReturn;
	}
	

}
