package app;

import controller.JuegoController;
import view.ConsolaView;
import model.fisico.*;
import model.magico.*;

public class Main {
    public static void main(String[] args) {
        JuegoController control = new JuegoController();
        ConsolaView vista = new ConsolaView();

        // Asesino(nombre, nivel, salud, agilidad, sigilo)
        Asesino ase = new Asesino("Ezio", 10, 100, 20, 80);
        // Arquero(nombre, nivel, salud, destreza, flechas)
        Arquero arq = new Arquero("Legolas", 8, 90, 15, 20);
        // Clerigo(nombre, nivel, vida, mana, fuerza, int, deidad)
        Clerigo cle = new Clerigo("Uther", 12, 150, 60, 10, 25, "Luz");

        control.agregarPersonaje(ase);
        control.agregarPersonaje(arq);
        control.agregarPersonaje(cle);

        vista.mostrarEstado(control.getPersonajes());
        control.simularTurno();
    }
}