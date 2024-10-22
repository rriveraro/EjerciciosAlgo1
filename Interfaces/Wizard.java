package Interfaces;

public class Wizard extends Personaje implements AtacanteADistancia {

    public Wizard(String nombre, int nivel,int puntosVida){
        super(nombre, nivel, puntosVida);
    }

    @Override
    public void defender(int danioRecibido){
        int danioReducido = Math.max(danioRecibido - 3, 0);
        puntosVida -= danioReducido;
        System.out.println(nombre + " se defiende y reduce el daño a " + danioReducido + " puntos.");
    }


    @Override
    public void atacar(Personaje enemigo){
        //Paladin al atacar quita 5 puntos de vida al contrincante.
        System.out.println(nombre + "ataca con fuerza! Quita 5 puntos de vida al contrincante. ");
        enemigo.defender(3);
    }
    
    @Override
    public void atacarDistancia(Personaje enemigo){
        System.out.println(nombre + " lanza un hechizo a distancia! Evade la defensa, quita 3 puntos de vida");
        enemigo.puntosVida-=3;
    }

    
    
}
