
package Problema2;

import java.util.ArrayList;
import java.util.List;


public class Cliente {

    private String nombre;
    private List<Alquiler> alquileres;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.alquileres = new ArrayList<>();
    }

     
     
    public String Nombre() {
        return nombre;
    }

    public List<Alquiler> Alquileres() {
        return alquileres;
    }

    public void agregarAlquiler(Alquiler alquiler) {
        this.alquileres.add(alquiler);
    }
    
}
