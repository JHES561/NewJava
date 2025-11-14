package Practica2;

import java.util.ArrayList;

public class SistemaNomina {
    public static void main(String[] args) {
       
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Catedratico ("Luis","02599"));
        personas.add(new Catedratico ("Leo","02600"));
        personas.add(new Administrativo("Ana", "01566"));
        personas.add(new Administrativo("Pedro", "01577"));

        for(Persona persona : personas){
            persona.verDetalle();
        }
    }
}