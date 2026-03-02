package daw.app.model.magico;

public class Clerigo extends PersonajeMagico implements Curandero{
    private String deidad;

    public Clerigo(String nombre, int nivel, int puntosdevida, int puntosdemana, int fuerza, int inteligencia, String deidad ){
        super(nombre, nivel, puntosdevida, puntosdemana, fuerza, inteligencia);
        this.deidad = deidad;
    }

    @Override
    public void atacar(Personaje objetivo){
        int dano = getInteligencia() * 2;
        objetivo.setSalud(objetivo.getSalud() - dano);
        System.out.println("El Clerigo " + getNombre() + " invoca el poder de " + deidad + " y golpea a " + objetivo.getNombre() + " causando " + dano + " de daño sagrado.");
    }

    @Override
    public void curar(Personaje objetivo){
        if (getMana() >= 20){
            int sanacion = getInteligencia() * 3;
            setSalud(getSalud() + sanacion);
            setMana(getMana() - 20);
            System.out.println("CURADO " + getNombre() + " realiza una oración de sanación y recupera " + sanacion + " PS ");
        } else{
            System.out.println("NO CURADO " + getNombre() + " No tienes suficiente mana para curar.");
        }
    }
    public String getDeidad(){
        return deidad;
    }
}
