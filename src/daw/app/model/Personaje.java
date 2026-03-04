package model;

import java.util.Objects;

public abstract class Personaje {
    private static int contadorId = 1; 
    
    private final String id;
    private String nombre;
    private int nivel;
    private int puntosDeVida;

    public Personaje(String nombre, int nivel, int puntosDeVida) {
        this.id = "PJ-" + contadorId; 
        contadorId++; 
        
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
    }

    public abstract void atacar(Personaje objetivo);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(id, personaje.id);
    }

    @Override 
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getPuntosDeVida() { return puntosDeVida; }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + " " + id + "] " + nombre + " (Nv: " + nivel + " | PS: " + puntosDeVida + ")";
    }
}