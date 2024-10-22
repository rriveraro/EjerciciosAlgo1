package igualdadordencopia3;

public class Persona {
    String nombre;
    int edad;
    Documento documento;

    public Persona(String nombre, int edad, Documento documento){
        this.nombre = nombre;
        this.edad = edad;
        this.documento= documento;
    }

    //constructor de copia
    public Persona(Persona original){
        this.nombre = original.nombre;
        this.edad=original.edad;
        this.documento= new Documento(original.documento);
    }

    //metodo construccion de copia
    public static Persona copiaProfunda(Persona original){
        return new Persona(original);
    }
}
