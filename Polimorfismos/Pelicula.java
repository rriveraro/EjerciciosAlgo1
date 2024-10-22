package Polimorfismos;
public class Pelicula extends Medio{
    String titulo;
    String director;

    public Pelicula(String titulo, String director){
        this.titulo= titulo;
        this.director= director;
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo pelicula: " + titulo + " dirigida por " + director);
    }
}