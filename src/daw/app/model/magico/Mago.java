package model.magico;
import model.Personaje;
import model.interfaces.Curable;

public class Mago extends PersonajeMagico implements Curable {
    private String elemento;

    public Mago(String nombre, int nivel, int puntosDeVida, int mana, int inteligencia, String elemento) {
        super(nombre, nivel, puntosDeVida, mana, inteligencia);
        this.elemento = elemento;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (getMana() >= 15) {
            int dano = getInteligencia() * 2;
            objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - dano);
            setMana(getMana() - 15);
            System.out.println("El Mago " + getNombre() + " lanza un hechizo de " + elemento + " a " + objetivo.getNombre() + " causando " + dano + " de daño.");
        } else {
            System.out.println(getNombre() + " no tiene suficiente maná para atacar. ¡Debe meditar!");
            meditar();
        }
    }

    @Override
    public void curar(Personaje objetivo) {
        int cura = getInteligencia() * 2;
        objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() + cura);
        System.out.println(getNombre() + " usa su magia elemental para sanar a " + objetivo.getNombre() + " en " + cura + " puntos.");   
    }
    
    public String getElemento() { 
        return elemento; 
    }
}