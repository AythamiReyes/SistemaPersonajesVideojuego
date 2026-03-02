package model.magico;

import model.Personaje;
import interfaces.Curable;
import interfaces.Estratega;

public class Mago extends Personaje implements Curable, Estratega {
    private int elemento;

    public Mago(String id, String nombre, int nivel, int puntosDeVida, int mana, int inteligencia, String elemento){
        super(id, nombre, nivel, puntosDeVida, mana, inteligencia);
        this.elemento = asignarElemento(elemento);
    }

    @Override
    public void atacar(Personaje objetivo){
        if (getMana() >= 15){
            int dano = getInteligencia() * 2;
            objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - dano);
            setMana(getMana() - 15);
            System.out.println("Mago"+ getNombre() + " lanza un hechizo de " + getElemento() + " a " + objetivo.getNombre() + " causando "+ dano + " de daño.");
        } else{
            System.out.println("El "+ getNombre()+" no tiene suficiente mana para atacar.");
        }
    }

    @Override
    public void curar(){
        if cura = getInteligencia() * 3;
        setPuntosDeVida(getPuntosDeVida() + cura);
        System.out.println("El "+ getNombre() + "usa su magia para sanarse " + cura + " puntos de salud.");   
    }

    @Override
    public void planificar(){
        System.out.println("El " + getNombre() + " analiza el campo de batalla para optimizar su proximo conjuro.");
    }
    
    public int getElemento(){
        return elemento;
    }
   
}