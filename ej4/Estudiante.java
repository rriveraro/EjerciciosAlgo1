package ej4;

import java.util.Arrays;

public class Estudiante {
     // Atributos
     String nombre;
     int edad;
     String carrera;
     String[] materias;
     
     static int estudiantesTotales = 0; // al declararla como estatica podemos compartirla con todas las instancias de la clase!

     
     // Método constructor
     public Estudiante(String nombre, int edad, String carrera, String[] materias) {
         this.nombre = nombre;
         this.edad = edad;
         this.carrera = carrera;
         this.materias = materias;

         estudiantesTotales++; //dentro del constructor hacemos que esta variable se incremente cada vez que se utiliza el constructor.
     }
    //usamos la sobrecarga de constructores para crear un constructor que solo acepte nombre y edad como parametros.
     public Estudiante(String nombre, int edad){
      this.nombre = nombre;
      this.edad = edad;
      this.carrera = "No especificada";
      this.materias = new String[0]; //asi creamos un arreglo vacio por defecto!

      estudiantesTotales++;
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

    public static int getEstudiantesTotales(){
      return estudiantesTotales;
    }//creamos este metodo que devuelve los estudiantes totales cada vez que lo llamemos :)

    public void presentarse(){
      System.out.println("Mi nombre es " + nombre + " y tengo " + edad + "años.");
    }

    //metodo de la clase para crear une studiante desde la clase misma 
    public static Estudiante agregarEstudiante(String nombre, int edad){
      //creamos la nueva instancia de estudiante
      Estudiante nuevoEstudiante = new Estudiante(nombre, edad);
      return nuevoEstudiante;
    }

}
