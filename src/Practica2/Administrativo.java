package Practica2;

public class Administrativo extends Persona{
    private String codigo;

    public Administrativo(String nombre, String codigo) {
        super(nombre);
        this.codigo = codigo;
    }

    public void verDetalle(){
        System.out.println("soy administrativo");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Administrativo [nombre=" + nombre + ", codigo=" + codigo + "]";
    }
}
