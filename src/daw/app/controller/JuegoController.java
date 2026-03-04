package controller;

import model.Personaje;
import model.fisico.Defendible;
import model.fisico.Sigiloso;
import java.util.ArrayList;

public class JuegoController {
    private ArrayList<Personaje> listaPersonajes;

    public JuegoController() {
        this.listaPersonajes = new ArrayList<>();
    }

    public void agregarPersonaje(Personaje p) {
        listaPersonajes.add(p);
    }

    public void simularTurno() {
        for (Personaje p : listaPersonajes) {
            p.atacar(p); 

            if (p instanceof Sigiloso) {
                ((Sigiloso) p).atacar(p);
            }

            if (p instanceof Defendible) {
                ((Defendible) p).ocultar();
                ((Defendible) p).defender();
            }
        }
    }

    public ArrayList<Personaje> getPersonajes() {
        return listaPersonajes;
    }
}