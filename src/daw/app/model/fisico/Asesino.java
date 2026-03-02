package model.fisico;
import model.Personaje;

public class Asesino extends PersonajeFisico implements Sigiloso, Defendible {

    private int agilidad;
    private int sigilo;

    public Asesino(String nombre, int nivel, int salud, int agilidad, int sigilo){
        super(nombre, nivel, salud);
        this.agilidad = agilidad;
        this.sigilo = sigilo;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int dano = agilidad * 3;
        objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - dano);
        System.out.println(getNombre() + " apuñala a " + objetivo.getNombre() + " causando " + dano + " de daño.");
    }

    // Método ocultar.
    @Override
    public void ocultar(){
        System.out.println(getNombre() + " se oculta en la niebla " + sigilo);        
    }

    // Método defender planteado para evadir.
    @Override
    public void defender(){
        System.out.println(getNombre() + " esquiva el ataque con su agilidad " + agilidad);
    }

    //Método de ataque oculto.

    public void golpeOculto(Personaje objetivo){
        int dano = agilidad * 5;
        objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - dano);
        System.out.println(" Ataque oculto " + getNombre() + " hace " + dano + " de daño por la espalda.");
    }

    //Getters
    public int getAgilidad(){return agilidad; }
    public int getSigilo(){return sigilo; }
}