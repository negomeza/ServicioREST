/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductoPK;

import Modelo.ProductoModelo;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author NELSON
 */
@Path("ProductoSW")
public class Producto {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Producto
     */
    public Producto() {
    }

    /**
     * Retrieves representation of an instance of ProductoPK.Producto
     * @return an instance of java.lang.String
     */
    @GET
    @Path("obtenerHtml1")
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        return "<h1>Buenas tardes</h1>";
    }

    
    @GET
    @Path("obtenerHtml2")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHtml2() {
        return "{\n" +
"  \"nombre\": \"Juan\",\n" +
"  \"edad\": 30\n" +
"}";
    }
    
    
    @GET
    @Path("obtenerXml")
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        return "<persona>\n" +
"  <nombre>Juan</nombre>\n" +
"  <edad>30</edad>\n" +
"</persona>";
    }
    
static final List<ProductoModelo> lista = new ArrayList<>();
    
@GET 
@Produces(MediaType.APPLICATION_JSON)
@Path("Getlista") 
public List<ProductoModelo> getLista() {
        // Puedes agregar elementos a la lista aquí
        ProductoModelo p = new ProductoModelo(1, "Palillos", 50);
        lista.add(p);
        
        // Devuelve la lista actual
        return lista;
    }

    /**
     * PUT method for updating or creating an instance of Producto
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
