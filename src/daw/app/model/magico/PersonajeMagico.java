package model.magico;
import model.Personaje;

public abstract class PersonajeMagico extends Personaje {
    private int mana;
    private int intelingencia;
    
    public PersonajeMagico(String nombre, int nivel, int puntosDeVida, int mana, int inteligencia){
        super(nombre, nombre, nivel, puntosDeVida);
        this.mana = mana;
        this.intelingencia = inteligencia;
    }

    public void meditar(){
        System.out.println(getNombre() + " esta meditando para recuperar mana");
        this.mana += 15;
    }

    public int getMana(){
        return mana;
    }

    public void setMana(int mana){
        this.mana = mana;
    }

    public int getIneteligencia(){
        return intelingencia;
    }

    public void setInteligencia(int inteligencia){
        this.intelingencia = inteligencia;
    }

}