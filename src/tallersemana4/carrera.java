
package tallersemana4;


class carrera {
    
    private String nombre;
    private double precioBase;
    private double incrementoPorSemestre;

    public carrera(String nombre, double precioBase, double incrementoPorSemestre) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.incrementoPorSemestre = incrementoPorSemestre;
    }


    public String Nombre() {
        return nombre;
    }

    public double PrecioBase() {
        return precioBase;
    }

    public double IncrementoPorSemestre() {
        return incrementoPorSemestre;
    }
}

