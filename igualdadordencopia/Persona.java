package igualdadordencopia;

public final class Persona {
    //Diseñar una clase inmutable llamada Persona que tenga como atributos nombre, apellido y documento. El documento debe ser de tipo Documento, una clase también inmutable, y se modela con un número entero, una fecha de emisión y otra fecha de vencimiento. Implementar la clase Persona con un único constructor que inicialice todos sus atributos.
    private final String nombre;
    private final String apellido;
    private final Documento documento;

    public Persona(String nombre, String apellido, Documento documento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.documento = documento;
    }

    public Persona renovarDocumento() {
        return new Persona(this.nombre, this.apellido, this.documento.renovarDocumento());
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }
    
    public Documento getDocumento(){
        return documento;
    }
}
