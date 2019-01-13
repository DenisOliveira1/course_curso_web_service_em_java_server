package br.edu.denis.rest;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import br.edu.denis.entidade.Cep;

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
    @Path("/{getCep : (?i)getcep}")//deixa case insensitive
    public Cep getCep() {
    	Cep toReturn = new Cep();
    	toReturn.setCep("37713130");
    	toReturn.setBairro("bairro "+new Random().nextInt(20));
    	toReturn.setNumero(new Random().nextInt(100));
    	toReturn.setRua("rua "+new Random().nextInt(100));
    	toReturn.setEstado("MG");
    	
        return toReturn;
    }
}
