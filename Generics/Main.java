package Generics;

public class Main {
    public static void main(String[] args) {
        Contenedor<String> contenedorString = new Contenedor<>("Inicial");
        System.out.println("Contenido inicial del contenedor: " + contenedorString.obtenerElemento());
        contenedorString.agregar("Hola");
        System.out.println("Contenido del contenedor después de agregar: " + contenedorString.obtenerElemento());
        System.out.println("El contenedor está vacío? " + contenedorString.estaVacio());
        System.out.println("El contenido es igual a 'Hola'? " + contenedorString.esIgual("Hola"));
        contenedorString.quitar();
        System.out.println("El contenedor está vacío después de quitar el elemento? " + contenedorString.estaVacio());

        // Inicializando el contenedor sin un elemento
        Contenedor<Integer> contenedorInteger = new Contenedor<>();
        contenedorInteger.agregar(42);
        System.out.println("Contenido del contenedor: " + contenedorInteger.obtenerElemento());
        System.out.println("El contenedor está vacío? " + contenedorInteger.estaVacio());
        System.out.println("El contenido es igual a 42? " + contenedorInteger.esIgual(42));
        contenedorInteger.quitar();
        System.out.println("El contenedor está vacío después de quitar el elemento? " + contenedorInteger.estaVacio());
    }
    
    
}
