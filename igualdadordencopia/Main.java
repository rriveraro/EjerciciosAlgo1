package igualdadordencopia;


public class Main {
    public static void main(String[] args) {
        //Generar un arreglo de 5 personas y agregar instancias previamente generadas. Implementar un método que muestre las personas del arreglo y sus respectivos documentos.Renovar el documento de 2 personas.Verificar qué sucede con las personas del arreglo y sus documentos.

        // Crear un arreglo de objetos de tipo Persona
        Persona[] personas = new Persona[5];

        personas[0]=new Persona("Silvia", "Tobio", new Documento(21443214));
        personas[1] = new Persona("Rocio", "Rivera", new Documento(43543830));
        personas[2] = new Persona("Alejo", "Rivera", new Documento(45718045));
        personas[3] = new Persona("Alejandra", "Rivera", new Documento(33890123));
        personas[4] = new Persona("Juan", "Rivera", new Documento(44398283));

        mostrarPersonas(personas);

        //ahora renovamos el docu de 2 personas.

        personas[1] = personas[1].renovarDocumento();
        personas[2]= personas[2].renovarDocumento();

        mostrarPersonas(personas);


    }

    public static void mostrarPersonas(Persona[] personas){
        for(Persona persona : personas){
            System.out.println(persona.getNombre() + " " + persona.getApellido() +  " - " + persona.getDocumento());

        }
    }
}
