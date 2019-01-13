package br.edu.denis.util;

import java.util.Set;

import javax.ws.rs.core.Application;

import br.edu.denis.rest.CepService;
import br.edu.denis.rest.RestService1;
import br.edu.denis.rest.RestService2;

/**
 * Esse é um metodo, o outro seria configurar pelo web.xml
 */

@javax.ws.rs.ApplicationPath("/rest")//se tiver isso na url sera uma requisicao para o webservice e sera encaminhada para uma das classes de service rest aqui adicionadas
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(RestService1.class);  
        resources.add(RestService2.class);  
        resources.add(CepService.class);  
    }
}
