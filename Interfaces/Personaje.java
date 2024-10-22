package Interfaces;

public abstract class Personaje {
    String nombre;
    int nivel;
    int puntosVida;

    public Personaje (String nombre, int nivel, int puntosVida){
        this.nombre=nombre;
        this.nivel=nivel;
        this.puntosVida=puntosVida;
    }

    public abstract void atacar(Personaje enemigo);
    public abstract void defender(int danioRecibido);

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Nivel: " + nivel + ", Puntos de Vida: " + puntosVida;
    }
}
