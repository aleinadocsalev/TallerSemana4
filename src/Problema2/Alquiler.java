
package Problema2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Alquiler {
    private Cliente cliente;
    private Barco barco;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int posicionAmarre;
    private static final double COSTO_POR_DIA = 25000;

    public Alquiler(Cliente cliente, Barco barco, LocalDate fechaInicio, LocalDate fechaFin, int posicionAmarre) {
        this.cliente = cliente;
        this.barco = barco;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posicionAmarre = posicionAmarre;
    }


    public double calcularCosto() {
        long diasOcupacion = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        return diasOcupacion * COSTO_POR_DIA;
    }

    public void imprimirRecibo() {
        System.out.println("\nRecibo de Alquiler");
        System.out.println("------------------");
        System.out.println("Cliente: " + cliente.Nombre());
        System.out.println("Barco:");
        System.out.println("  Matrícula: " + barco.Matricula());
        System.out.println("  Eslora: " + barco.Eslora() + " metros");
        System.out.println("  Año de Fabricación: " + barco.AñoFabricacion());
        System.out.println("Fecha de Inicio: " + fechaInicio);
        System.out.println("Fecha de Fin: " + fechaFin);
        System.out.println("Posición del Amarre: " + posicionAmarre);
        System.out.println("Costo Total: $" + calcularCosto());
    }
}
