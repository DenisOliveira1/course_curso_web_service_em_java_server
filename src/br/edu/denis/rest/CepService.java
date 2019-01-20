package br.edu.denis.rest;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import br.edu.denis.entidade.Cep;
import br.edu.denis.entidade.Vizinho;
import br.edu.denis.validacao.CepParametros;

@Path("/cep")
public class CepService {
	@SuppressWarnings("unused")
    @Context
    private UriInfo context;

   //construtor
    public CepService() {
        // TODO Auto-generated constructor stub
    }
    
    //metodos
    @GET//por padrao acessar uma url já é um get
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{getCep : (?i)getcep}/{cepRecebido}")//deixa case insensitive
    public Cep getCep(@CepParametros @PathParam(value="cepRecebido")String cepRecebido) {
    	
    	Cep toReturn = new Cep();
    	toReturn.setCep(cepRecebido);
    	toReturn.setBairro("bairro "+new Random().nextInt(20));
    	toReturn.setNumero(new Random().nextInt(100));
    	toReturn.setRua("rua "+new Random().nextInt(100));
    	toReturn.setEstado("MG");
    	
        return toReturn;
    }
    
    @GET//por padrao acessar uma url já é um get
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{getCepByRua : (?i)getcepbyrua}/{ruaRecebida}")//deixa case insensitive
    public List<Cep> getCepByRua(@PathParam(value="ruaRecebida")String ruaRecebida) {
    	
    	List<Cep> toReturn = new LinkedList<>();
    	
    	for(int i=0;i<10;i++) {
   		
    		Cep aux = new Cep();
    		aux.setCep(Integer.toString(i));
    		aux.setBairro("bairro "+new Random().nextInt(20));
    		aux.setNumero(new Random().nextInt(100));
    		aux.setRua("rua "+ruaRecebida);
    		aux.setEstado("MG");
    		
    		for(int j=0;j<2;j++) {
    	   		
        		Vizinho aux2 = new Vizinho("vizinho "+Integer.toString(j));
        		aux.addVizinho(aux2);
        	}
    		
    		toReturn.add(aux);
    	}
    	
        return toReturn;
    }
    

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{setCep : (?i)setcep}")
    public void setCep(@Valid Cep cepRecebido) {//as validacoes sempre ocorrem ans chamadas do metodo
    	//esse @Valid diz que nessa chamada validacoes do tipo FIELD dentro desseobjeto devem ser verificadas
    	System.out.println("Objeto cep recebido:");
    	System.out.println(cepRecebido.toString());
    }

}

