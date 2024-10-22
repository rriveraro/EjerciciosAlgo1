package ClasesAbstractas;

public class Wizard extends Personaje {

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

    
    
}
