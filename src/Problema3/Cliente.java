
package Problema3;


public class Cliente {
    private String nombres;
    private String apellidos;
    private int edad;
    private String representante;

    public Cliente(String nombres, String apellidos, int edad, String representante) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.representante = representante;
    }

    public String Nombres() {
        return nombres;
    }

    public String Apellidos() {
        return apellidos;
    }

    public int Edad() {
        return edad;
    }

    public String Representante() {
        return representante;
    }

}
