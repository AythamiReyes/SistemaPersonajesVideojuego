package model.fisico;
import model.Personaje;

public abstract class PersonajeFisico extends Personaje {
    
    public PersonajeFisico(String nombre, int nivel, int puntosDeVida) {
        super(nombre, nivel, puntosDeVida);
    }

    public void golpeBasico(Personaje objetivo) {
        System.out.println(getNombre() + " da un golpe básico a " + objetivo.getNombre());
        objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - 5);
    }
}