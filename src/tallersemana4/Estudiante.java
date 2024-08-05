
package tallersemana4;


class Estudiante {
    private String nombres;
    private String apellidos;
    private String documento;
    private String direccion;
    private String telefono;
    private boolean cursoEnLinea;
    private int semestre;
    private int creditosAplazados;

    public Estudiante(String nombres, String apellidos, String documento, String direccion, String telefono, boolean cursoEnLinea, int semestre, int creditosAplazados) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cursoEnLinea = cursoEnLinea;
        this.semestre = semestre;
        this.creditosAplazados = creditosAplazados;
    }

    public boolean CursoEnLinea() {
        return cursoEnLinea;
    }

    public int Semestre() {
        return semestre;
    }

    public int CreditosAplazados() {
        return creditosAplazados;
    }

    public String Nombres() {
        return nombres;
    }

    public String Apellidos() {
        return apellidos;
    }

    public String Documento() {
        return documento;
    }  
}
