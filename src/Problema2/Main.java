
package Problema2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
     
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = entrada.nextLine();
        Cliente cliente = new Cliente(nombreCliente);

        System.out.print("Ingrese la matrícula del barco: ");
        String matricula = entrada.nextLine();
        System.out.print("Ingrese la eslora del barco en metros: ");
        double eslora = entrada.nextDouble();
        System.out.print("Ingrese el año de fabricación del barco: ");
        int anioFabricacion = entrada.nextInt();
        entrada.nextLine(); 

        Barco barco = new Barco(matricula, eslora, anioFabricacion);

        System.out.print("Ingrese la fecha de inicio del alquiler (dd/MM/yyyy): ");
        LocalDate fechaInicio = LocalDate.parse(entrada.nextLine(), formatter);
        System.out.print("Ingrese la fecha de fin del alquiler (dd/MM/yyyy): ");
        LocalDate fechaFin = LocalDate.parse(entrada.nextLine(), formatter);

        System.out.print("Ingrese la posición del amarre: ");
        int posicionAmarre = entrada.nextInt();

        Alquiler alquiler = new Alquiler(cliente, barco, fechaInicio, fechaFin, posicionAmarre);
        cliente.agregarAlquiler(alquiler);

        alquiler.imprimirRecibo();

        entrada.close();
    }
}
