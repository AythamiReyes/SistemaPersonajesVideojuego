package model.fisico;
import model.Personaje;

public abstract class PersonajeFisico extends Personaje {
    public PersonajeFisico(String nombre, int nivel, int salud){
        super(nombre, nombre, nivel, salud);
    }

    public void golpeBasico(){
        System.out.println(getNombre() + " da un golpe básico");
    }

    public void defender() {
        throw new UnsupportedOperationException("Unimplemented method 'defender'");
    }

    public void atacar(Personaje objetivo) {
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }
}