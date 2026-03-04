package view;

import model.Personaje;
import java.util.ArrayList;

public class ConsolaView {
    public void mostrarEstado(ArrayList<Personaje> lista) {
        System.out.println("\n--- ESTADO DE LOS PERSONAJES ---");
        for (Personaje p : lista) {
            System.out.println(p.toString());
        }
    }
}