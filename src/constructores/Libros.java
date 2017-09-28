/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;


public class Libros {
    
    public abstract class libC {
    
    String nombre = "";
    String categoria = "";
    int nSerie = 0;
    String edicion = "";
    String autor = "";
    String editorial = "";
    int precio = 0;
    int venta = 0;
    int devolucion = 0;
    
    
    public abstract void publicaLibro();
    
    libC(String nombre, String autor, String edicion, String editorial,  String categoria, int nSerie, int precio, int devolucion) {
     
        this.nombre = nombre;
        this.autor = autor;
        this.edicion = edicion;
        this.editorial = editorial;
        this.categoria = categoria;
        this.nSerie = nSerie;
        this.precio = precio;
    }
    
    libC(int nSerie, String nombre, String categoria){
        this.categoria = categoria;
        this.nombre = nombre;
        this.nSerie = nSerie;
    }
    
    libC(String nombre, String autor, String editorial){
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    libC(int venta, int nSerie, int precio, String nombre){
        this.nSerie = nSerie;
        this.nombre = nombre;
        this.venta = venta;
        this.precio = precio;
    }
    
    libC(int devolucion, int precio, String nombre){
        this.nombre = nombre;
        this.devolucion = devolucion;
        this.precio = precio;
    }
    
}
    
}
