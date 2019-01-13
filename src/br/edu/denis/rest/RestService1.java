package br.edu.denis.rest;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/cumprimento")
public class RestService1 {
    @SuppressWarnings("unused")
    @Context
    private UriInfo context;

   //construtor
    public RestService1() {
        // TODO Auto-generated constructor stub
    }
    
    //metodos
    @GET//por padrao acessar uma url já é um get
    @Produces(MediaType.TEXT_PLAIN)
    public String getApresentacao() {
        return "Escolha um cumprimento!";
    }
    
    @GET
    @Path("/bomdia")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBomDia() {
        return "Bom dia pra voce tambem!";
    }
    
    @GET
    @Path("/boanoite")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBoaNoite() {
        return "Boa Noite pra voce tambem!";
    }
    
    @GET
    @Path("/bomdia/{nome}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBomDiaNome(@PathParam(value="nome")String nome) {
        return "Bom dia pra voce tambem "+ nome +"!";
    }
    
    @GET
    @Path("/boanoite/{nome}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBoaNoiteNome(@PathParam(value="nome")String nome) {
        return "Boa Noite pra voce tambem "+ nome +"!";
    }

    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    	
    }

}