package practica4;

public class Estudiante extends Persona {
    private String codigoEstudiante;

    public Estudiante(String nombre, String codigoEstudiante) {
        super(nombre);
        this.setCodigoEstudiante(codigoEstudiante);
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public void registrarAcceso(){
        System.out.println(nombre +" "+ codigoEstudiante);
    }

    @Override
    public String toString() {
        return "Estudiante [codigoEstudiante=" + codigoEstudiante + ", getCodigoEstudiante()=" + getCodigoEstudiante()
                + "]";
    }
    
}
