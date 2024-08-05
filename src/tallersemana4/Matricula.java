
package tallersemana4;




class Matricula {
    
      public static double calcularCostoMatricula(Estudiante estudiante, carrera carrera) {
        double costoTotal = carrera.PrecioBase();
        
        if (estudiante.CursoEnLinea()) {
            if (estudiante.Semestre() >= 5) {
                costoTotal += costoTotal * carrera.IncrementoPorSemestre();
            }
        } else {
            int semestre = estudiante.Semestre();
            int creditosAplazados = estudiante.CreditosAplazados();
            double costoPorCredito;

            if (semestre <= 3) {
                costoPorCredito = 20;
            } else if (semestre <= 6) {
                costoPorCredito = 25;
            } else {
                costoPorCredito = 30;
            }

            costoTotal += creditosAplazados * costoPorCredito;
        }

        return costoTotal;
    }

    public static void imprimirRecibo(Estudiante estudiante, carrera carrera, double costoTotal) {
        System.out.println("\nRecibo de Inscripción");
        System.out.println("---------------------");
        System.out.println("Nombre: " + estudiante.Nombres() + " " + estudiante.Apellidos());
        System.out.println("Documento: " + estudiante.Documento());
        System.out.println("Carrera: " + carrera.Nombre());
        System.out.println("Semestre: " + estudiante.Semestre());
        System.out.println("Curso en línea: " + (estudiante.CursoEnLinea() ? "Sí" : "No"));
        if (!estudiante.CursoEnLinea()) {
            System.out.println("Créditos aplazados: " + estudiante.CreditosAplazados());
        }
        System.out.println("Costo Total: $" + costoTotal);
    }
}
