package practica4;

public class Profesor extends Persona {

    private String idDocente;

    public Profesor(String nombre, String idDocente) {
        super(nombre);
        this.setIdDocente(idDocente);
    }

    public String getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
    }

    public void registrarAcceso(){
        System.out.println(idDocente+" "+nombre);
    }

    @Override
    public String toString() {
        return "Profesor [idDocente=" + idDocente + ", getIdDocente()=" + getIdDocente() + "]";
    }
    
}