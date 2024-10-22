package igualdadordencopia3;

public class Main {
    public static void main(String[] args) {
        Documento doc1 = new Documento(43543830);
        Persona persona1 = new Persona("Rocio Rivera", 24, doc1);

        //Clonando usando constructor de copia
        Persona personaClon1 = new Persona(persona1);
        //Clonando usando metodo de construccion de copia
        Persona personaClon2 = Persona.copiaProfunda(persona1);
        
        System.out.println("Persona Clon 1");
        System.out.println("Comparación de nombre: " + persona1.nombre.equals(personaClon1.nombre)); // true
        System.out.println("Comparación de edad: " + (persona1.edad == personaClon1.edad)); // true
        System.out.println("Comparación de documento (referencia): " + (persona1.documento != personaClon1.documento)); // true

        System.out.println("Persona Clon 2");
        System.out.println("Comparación de nombre: " + persona1.nombre.equals(personaClon2.nombre)); // true
        System.out.println("Comparación de edad: " + (persona1.edad == personaClon2.edad)); // true
        System.out.println("Comparación de documento (referencia): " + (persona1.documento != personaClon2.documento)); // true

    }
}
