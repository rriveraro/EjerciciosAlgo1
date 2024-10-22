package igualdadordencopia2;

public class Main {
    public static void main(String[] args) {
        //Crear un programa de prueba (Main) que: Cree al menos dos objetos EstudianteGrado y dos objetos EstudiantePosgrado. Compruebe si dos estudiantes son iguales utilizando el método equals y muestre un mensaje que indique si son iguales o diferentes. Cree dos objetos de Estudiante con misma matrícula y verifique si son iguales. También, realizar una comparación de identidad (usando ==) de al menos dos de los objetos y mostrar un mensaje que indique si son iguales o diferentes.

        EstudianteGrado estudiante1 = new EstudianteGrado("Rocio Rivera", 24, 272727, "Licenciatura en Ciencia de Datos");
        EstudianteGrado estudiante2 = new EstudianteGrado("Alejandro Echeverri", 30, 373737, "Licenciatura en Ciencia de Datos");

        EstudiantePosgrado estudiante3 = new EstudiantePosgrado("Luciana Emberge", 19, 474747, "Ciencia de datos para recupera ambientes naturales para carpinchos");
        EstudiantePosgrado estudiante4 = new EstudiantePosgrado("Leonel Messi", 36, 575757, "Campeon del mundo");

        System.out.println(estudiante1.getNombre() +" es igual a " + estudiante2.getNombre() +"?: "+ estudiante1.equals(estudiante2));
        System.out.println(estudiante1.getNombre() +" es igual a " + estudiante1.getNombre() +"?: "+ estudiante1.equals(estudiante1));
        //System.out.println(estudiante2.getNombre() +" es igual a " + estudiante4.getNombre() +"?: "+ estudiante2.equals(estudiante4));


        EstudianteGrado estudiante5 = new EstudianteGrado("Pedro Pedro", 44, 373737, "Arquitectura");

        System.out.println(estudiante2.getNombre() +" es igual a " + estudiante5.getNombre() +"?: "+ estudiante2.equals(estudiante5));
        System.out.println(estudiante2.getNombre() +" es igual a " + estudiante5.getNombre() +"?: "+ (estudiante2 == estudiante5));
    

        
    }
    
    

}
