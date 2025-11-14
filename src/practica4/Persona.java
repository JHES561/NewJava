package practica4;

public abstract class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (this.nombre.length()>= 50) {
            System.out.println("el nombre no puede ser tan largo");
        }
        this.nombre = nombre;
    }

    public abstract void registrarAcceso();

    
    
}