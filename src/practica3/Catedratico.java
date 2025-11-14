/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author SCIS-PC18
 */
public class Catedratico extends Persona{
    private String codigo;

    public Catedratico(String codigo, String nombre) {
        super(nombre);
        this.setCodigo(codigo);
    }
    
    @Override
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
        return "Catedratico{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
}