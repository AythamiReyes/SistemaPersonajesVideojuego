package app;

import controller.JuegoController;
import view.ConsolaView;
import model.fisico.*;
import model.magico.*;

public class Main {
    public static void main(String[] args) {
        JuegoController control = new JuegoController();
        ConsolaView vista = new ConsolaView();

        Asesino ase = new Asesino("Katarina", 10, 100, 20, 80);
        Arquero arq = new Arquero("Varus", 8, 90, 15, 20);
        Guerrero gue = new Guerrero("Garen", 9, 120, 25, 50); 
        Clerigo cle = new Clerigo("Soraka", 12, 150, 60, 10, "Luz");
        Mago mag = new Mago("Veigar", 15, 110, 80, 30, "Fuego");

        control.agregarPersonaje(ase);
        control.agregarPersonaje(arq);
        control.agregarPersonaje(gue);
        control.agregarPersonaje(cle);
        control.agregarPersonaje(mag);

        vista.mostrarEstado(control.getPersonajes());
        
        control.simularTurno();
        
        vista.mostrarEstado(control.getPersonajes());
    }
}