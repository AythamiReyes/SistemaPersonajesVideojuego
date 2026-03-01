package daw.model.fisico;

import daw.interfaces.Sigiloso;
import daw.model.Personaje;

public class Arquero extends PersonajeFisico implements Sigiloso {

    private int destreza;
    private int flechas;

    public Arquero(String nombre, int nivel, int salud, int destreza, int flechas){
        super(nombre, nivel, salud);
        this.destreza = destreza;
        this.flechas = flechas;
    }

    //Método de atacar.
    @Override
    public void atacar(Personaje objetivo){
        if (flechas > 0){
            int dano = destreza * 2;
            objetivo.setSalud(objetivo.getSalud() - dano);
            flechas--;
            System.out.println(getNombre() + " dispara una flecha a " + objetivo.getNombre() + " causando " + dano + " de daño! Flechas restantes: " + flechas);
        }else {
            System.out.println(getNombre() + " no le quedan flechas.");
        }
    }

    // Método ocultar.
    @Override
    public void ocultar(){
        System.out.println(getNombre() + " Se oculta entre la niebla.");
    }

    //Método disparar flecha venenosa.
    public void dispararFlecha(Personaje objetivo){
        System.out.println(getNombre() + " dispara una flecha venenosa a " + objetivo.getNombre()); 
    }

    //Getters
    public int getDestreza(){return destreza; }
    public int getFlechas(){return flechas; }
}