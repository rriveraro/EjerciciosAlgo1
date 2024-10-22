package Generics2;

public class Main {
    public static void main(String[] args) {
        ListaGenerica<String> lista = new ListaGenerica<>();
        lista.add(0, "Hola");
        lista.add(1, "Mundo");
        lista.add(2, "Java");

        System.out.println("Lista después de agregar elementos:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("El contenedor está vacío? " + lista.esVacia());

        lista.remove(1);

        System.out.println("Lista después de eliminar el elemento en el índice 1:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("El contenido en el índice 0 es igual a 'Hola'? " + lista.get(0).equals("Hola"));

        lista.set(0, "Adiós");

        System.out.println("Lista después de cambiar el contenido en el índice 0:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
