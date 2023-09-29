/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author NELSON
 */
public class ProductoModelo {
    int inProducto;
    String nombre;
    int cantidad;

    public ProductoModelo(int inProducto, String nombre, int cantidad) {
        this.inProducto = inProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public ProductoModelo() {
    }

    public int getInProducto() {
        return inProducto;
    }

    public void setInProducto(int inProducto) {
        this.inProducto = inProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
