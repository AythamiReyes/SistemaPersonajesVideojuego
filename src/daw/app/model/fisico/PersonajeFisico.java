package daw.model.fisico;
import daw.model.Personaje;

public abstract class PersonajeFisico extends Personaje {
    public PersonajeFisico(String nombre, int nivel, int salud){
        super(nombre, nivel, salud);
    }

    // Método golpe basico.
    public void golpeBasico(){
        System.out.println(getNombre() + " da un golpe básico");
    }
}