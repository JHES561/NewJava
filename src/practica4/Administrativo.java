package practica4;

public class Administrativo extends Persona{
    private String credenciales;

    public Administrativo(String nombre, String credenciales) {
        super(nombre);
        this.setCredenciales(credenciales);;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }

    public void registrarAcceso(){
        System.out.println(nombre+" "+credenciales);
    }

    @Override
    public String toString() {
        return "Administrativo [credenciales=" + credenciales + ", getCredenciales()=" + getCredenciales() + "]";
    }

    
}
