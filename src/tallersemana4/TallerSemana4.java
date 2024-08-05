
package tallersemana4;

import java.util.Scanner;


public class TallerSemana4 {

  
    public static void main(String[] args) {
       
      Scanner entrada = new Scanner(System.in);
   
     
       carrera[] carreras = {
            new carrera("Ingeniería de Sistemas", 1500, 0.05),
            new carrera("Administración de Empresas", 1500, 0.05),
            new carrera("Medicina", 1500, 0.05)
        };
      
        System.out.println("Seleccione una carrera:" );
        for (int i = 0; i < carreras.length; i++) {
            System.out.println((i + 1) + ". " + carreras[i].Nombre());
        }
        int opcioncarrera = entrada.nextInt();
        entrada.nextLine();

        if (opcioncarrera < 1 || opcioncarrera > carreras.length) {
            System.out.println("Opción no válida.");
            return;
        }

        carrera carreraSeleccionada = carreras[opcioncarrera - 1];

        System.out.println("\nIngrese los datos del estudiante:");
        System.out.print("Nombres: ");
        String nombres = entrada.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = entrada.nextLine();
        System.out.print("Documento: ");
        String documento = entrada.nextLine();
        System.out.print("Dirección: ");
        String direccion = entrada.nextLine();
        System.out.print("Teléfono: ");
        String telefono = entrada.nextLine();
        System.out.print("Curso en línea (true/false): ");
        boolean cursoEnLinea = entrada.nextBoolean();
        System.out.print("Semestre: ");
        int semestre = entrada.nextInt();
        int creditosAplazados = 0;
        if (!cursoEnLinea) {
            System.out.print("Créditos aplazados: ");
            creditosAplazados = entrada.nextInt();
        }

        Estudiante estudiante = new Estudiante(nombres, apellidos, documento, direccion, telefono, cursoEnLinea, semestre, creditosAplazados);

        double costoTotal = Matricula.calcularCostoMatricula(estudiante, carreraSeleccionada);
        Matricula.imprimirRecibo(estudiante, carreraSeleccionada, costoTotal);

        entrada.close();
    }
    }
    

