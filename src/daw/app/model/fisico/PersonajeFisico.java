package model.fisico;
import model.Personaje;

public abstract class PersonajeFisico extends Personaje {
    public PersonajeFisico(String nombre, int nivel, int salud){
        super(nombre, nombre, nivel, salud);
    }

    // Método golpe basico.
    public void golpeBasico(){
        System.out.println(getNombre() + " da un golpe básico");
    }

    public void defender() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defender'");
    }

    public void atacar(Personaje objetivo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }
}