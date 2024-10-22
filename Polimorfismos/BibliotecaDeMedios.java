package Polimorfismos;

public class BibliotecaDeMedios {
    public static void main(String[] args) {
        // Crear un arreglo de objetos de tipo Medio
        Medio[] biblioteca = new Medio[3];

        biblioteca[0] = new Libro("La sabiduria para ser feliz y crear la paz", "Daisaku Ikeda");
        biblioteca[1]= new Musica("Enamorada" , " Miranda");
        biblioteca[2]= new Pelicula("Tipos de gentileza", "Yorgos Lanthimus");

        for (Medio medio : biblioteca) {
            medio.reproducir();
        }
    
    
    }

}
