package Polimorfismos;

public class Musica extends Medio {

    String titulo;
    String autor;

    public Musica(String titulo, String autor){
        this. titulo = titulo;
        this.autor = autor;
    }
    @Override
    public void reproducir(){
        System.out.println("Reproduciendo musica: " +  titulo + " de " + autor);
    }
}
