package ejercicio2;

import java.util.Arrays;

public class Estudiante {
     // Atributos
     String nombre;
     int edad;
     String carrera;
     String[] materias;
     
     // Método constructor
     public Estudiante(String nombre, int edad, String carrera, String[] materias) {
         this.nombre = nombre;
         this.edad = edad;
         this.carrera = carrera;
         this.materias = materias;
     }

    //metodo 
    //public void informar() {
      //  System.out.println("El estudiante " + nombre + " tiene " + edad + " años. Esta anotado en la carrera " + carrera + "y en las materias ");
        //for (String materia : materias) {
          //  System.out.println("- " + materia); 
        //}

    public String toString() {
         return "Estudiante: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera + 
                ", Materias: " + Arrays.toString(materias);
                
    }
}
