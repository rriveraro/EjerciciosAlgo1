package ejercicio1;

import java.time.LocalDate;

public class libros {
     // Atributos
     String titulo;
     String autor;
     int anioPublicacion;
     
     // Método constructor
     public libros(String titulo, String autor) {
         this.titulo = titulo;
         this.autor = autor;
         this.anioPublicacion = LocalDate.now().getYear();
     }
     //Costructur con otros parametros
     public libros(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    //metodo 
    public void saludar() {
        System.out.println("El libro " + titulo + " fue escrito por " + autor + " y publicado en el año " + anioPublicacion );
    }

    
}

