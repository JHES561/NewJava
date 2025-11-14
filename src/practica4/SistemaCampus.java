package practica4;

import java.util.ArrayList;

public class SistemaCampus {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Estudiante("juan","1212"));
        personas.add(new Profesor("Luis", "1212"));
        personas.add(new Administrativo("Edwar", "1313"));

        for (Persona persona : personas) {
            persona.registrarAcceso();
        }
    }
}