package model.fisico;
import model.Personaje;

public class Guerrero extends PersonajeFisico implements Defendible {

    private int fuerza;
    private int armadura;

    public Guerrero(String nombre, int nivel, int salud, int fuerza, int armadura){
        super(nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }

    //Método de atacar.
    @Override
    public void atacar(Personaje objetivo){
        int dano = fuerza * 2;
        objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - dano);
        System.out.println(getNombre() + " ataca a " + objetivo.getNombre() + " causando " + dano + " de daño.");
    }

    // Método defender.
    @Override
    public void defender(){
        System.out.println(getNombre() + " Se defiende con su armadura " + armadura);
    }

    //Método de ataque crítico.
    public void ataqueCritico(Personaje objetivo){
        int dano = fuerza * 4;
        objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - dano);
        System.out.println("¡Ataque crítico! " + getNombre() + " a hecho " + dano + " de daño.");
    }

    //Getters
    public int getFuerza(){return fuerza; }
    public int getArmadura(){return armadura; }

    @Override
    public void ocultar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ocultar'");
    }

}