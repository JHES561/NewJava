package Practica2;

public class Catedratico extends Persona{
    private String codigo;

    public Catedratico(String nombre, String codigo) {
        super(nombre);
        this.setCodigo(codigo);
    }

    public void verDetalle(){
        System.out.println("soy catedratico");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Catedratico [nombre=" + nombre + ", codigo=" + codigo + "]";
    }

}
