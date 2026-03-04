package controller;
import model.Personaje;
import model.interfaces.Curable;
import model.interfaces.Defendible;
import java.util.ArrayList;

public class JuegoController {
    private ArrayList<Personaje> personajes;

    public JuegoController() {
        this.personajes = new ArrayList<>();
    }

    public void agregarPersonaje(Personaje p) {
        personajes.add(p);
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void simularTurno() {
        System.out.println("\n---INICIANDO SIMULACIÓN DE TURNO ---");
        
        if (personajes.size() < 2) {
            System.out.println("No hay suficientes personajes para simular un combate.");
            return;
        }

        for (int i = 0; i < personajes.size(); i++) {
            Personaje atacante = personajes.get(i);
            Personaje objetivo = personajes.get((i + 1) % personajes.size());

            System.out.println("\n Turno de: " + atacante.getNombre());
            
            atacante.atacar(objetivo);

            if (atacante instanceof Curable) {
                System.out.println("   [Capacidad detectada]: Este personaje puede curar.");
                ((Curable) atacante).curar(atacante); 
            }
            
            if (atacante instanceof Defendible) {
                System.out.println("   [Capacidad detectada]: Este personaje puede defenderse.");
                ((Defendible) atacante).defender();
            }
        }
        System.out.println("\n---FIN DEL TURNO---");
    }
}