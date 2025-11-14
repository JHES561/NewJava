package practica3;

import java.util.ArrayList;

public class SistemaNomina {

    public static void main(String[] args) {
        
        ArrayList<Catedratico> catedraticos = new ArrayList<>();
        ArrayList<Administrativo> administrativos = new ArrayList<>();
        
        ArrayList<Persona> personas = new ArrayList<>();
        
       
        
        catedraticos.add(new Catedratico ("Luis","02599"));
        catedraticos.add(new Catedratico ("Leo","02600"));
        
        
        administrativos.add(new Administrativo("Ana", "01566"));
        administrativos.add(new Administrativo("Pedro", "01577"));
        
        personas.add(new Catedratico ("Luis","02599"));
        personas.add(new Catedratico ("Leo","02600"));
        personas.add(new Administrativo("Ana", "01566"));
        personas.add(new Administrativo("Pedro", "01577"));
         
        for(Persona persona : personas){
            persona.verDetalle();
        }
    }
}