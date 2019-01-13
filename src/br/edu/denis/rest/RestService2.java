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

@Path("/pergunta")
public class RestService2 {
    @SuppressWarnings("unused")
    @Context
    private UriInfo context;

   //construtor
    public RestService2() {
        // TODO Auto-generated constructor stub
    }
    
    //metodos
    @GET//por padrao acessar uma url já é um get
    @Produces(MediaType.TEXT_PLAIN)
    public String getApresentacao() {
        return "Escolha a pergunta pelo caminho!";
    }
    
    @GET
    @Path("/tudobem")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTudoBem() {
        return "Tudo bem! e voce?";
    }
    
    @GET
    @Path("/comovai")
    @Produces(MediaType.TEXT_PLAIN)
    public String getComoVai() {
        return "Vou bem, e voce?";
    }
    
    @GET
    @Path("/tudobem/{nome}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTudoBemNome(@PathParam(value="nome")String nome) {
        return "Tudo bem! e voce"+ nome +"?";
    }
    
    @GET
    @Path("/comovai/{nome}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getComoVaiNome(@PathParam(value="nome")String nome) {
        return "Vou bem, e voce" + nome +"?";
    }
    

    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    	
    }

}