package ej3;

public class Rectangulo {
    // Atributos
     double largo;
     double ancho;
     
     // Método constructor
     public Rectangulo(double largo, double ancho) {
         this.largo = largo;
         this. ancho = ancho;
     }

    //metodo
     public double perimetro(){
        return (2*(ancho + largo));
     }

     public double area(){
        return (ancho * largo);
     }

}
