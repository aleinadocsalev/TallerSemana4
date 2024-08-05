
package Problema2;


public class Barco {
    private String matricula;
    private double eslora;
    private int añoFabricacion;

    public Barco(String matricula, double eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public String Matricula() {
        return matricula;
    }

    public double Eslora() {
        return eslora;
    }

    public int AñoFabricacion() {
        return añoFabricacion;
    }
}
