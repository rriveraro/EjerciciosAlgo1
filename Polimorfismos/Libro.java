package Polimorfismos;

public class Libro extends Medio{
    String titulo;
    String autor;

    public Libro(String titulo, String autor){
        this.titulo= titulo;
        this.autor= autor;
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo libro: " + titulo + " de " + autor);
    }
}
