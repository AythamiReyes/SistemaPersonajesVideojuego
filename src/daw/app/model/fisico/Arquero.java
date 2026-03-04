package model.fisico;
import model.Personaje;
import model.interfaces.Sigiloso;

public class Arquero extends PersonajeFisico implements Sigiloso {

    private int destreza;
    private int flechas;

    public Arquero(String nombre, int nivel, int puntosDeVida, int destreza, int flechas){
        super(nombre, nivel, puntosDeVida);
        this.destreza = destreza;
        this.flechas = flechas;
    }

    //Método de atacar.
    @Override
    public void atacar(Personaje objetivo){
        if (flechas > 0){
            int dano = destreza * 2;
            objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - dano);
            flechas--;
            System.out.println(getNombre() + " dispara una flecha a " + objetivo.getNombre() + " causando " + dano + " de daño! Flechas restantes: " + flechas);
        }else {
            System.out.println(getNombre() + " no le quedan flechas. Debe usar un ataque básico.");
            golpeBasico(objetivo);
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