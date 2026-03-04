package model.magico;

import model.Personaje;
import model.interfaces.Curable;

public class Clerigo extends PersonajeMagico implements Curable {
    private String deidad;

    public Clerigo(String nombre, int nivel, int puntosDeVida, int mana, int inteligencia, String deidad) {
        super(nombre, nivel, puntosDeVida, mana, inteligencia);
        this.deidad = deidad;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int dano = getInteligencia() * 2;
        objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - dano);
        System.out.println("El Clérigo " + getNombre() + " invoca el poder de " + deidad + " y golpea a "
                + objetivo.getNombre() + " causando " + dano + " de daño sagrado.");
    }

    @Override
    public void curar(Personaje objetivo) {
        if (getMana() >= 20) {
            int sanacion = getInteligencia() * 3;
            objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() + sanacion);
            setMana(getMana() - 20);
            System.out.println(getNombre() + " realiza una oración y cura a " + objetivo.getNombre()
                    + " restaurando " + sanacion + " PS.");
        } else {
            System.out.println(getNombre() + " no tiene suficiente maná para curar.");
        }
    }

    public String getDeidad() {
        return deidad;
    }
}
