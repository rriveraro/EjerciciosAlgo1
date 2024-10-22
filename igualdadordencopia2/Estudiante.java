package igualdadordencopia2;

public class Estudiante {
    //a) Crear una clase base llamada Estudiante con los siguientes atributos y métodos:
    
    private String nombre;
    private int edad;
    int matricula;
    
    //Constructor para inicializar nombre y edad.
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //alejandro = alejandro true - alejandro == pedro false, sigue abajo
        if (obj == null || getClass() != obj.getClass()) return false; // Clase Perro = null o Clase Perro contra Clase Gato -> false. Si no, sigue abajo.
        Estudiante that = (Estudiante) obj; //(Estudiante) obj: Esto es un "cast" que dice "trata este objeto como un Estudiante". Si obj no es realmente un Estudiante, lanzará una excepción en tiempo de ejecución.Estudiante that = (Estudiante) obj;: Después del cast, that es una referencia al mismo objeto que obj, pero ahora el compilador sabe que es de tipo Estudiante.
        return matricula == that.matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getMatricula() {
        return matricula;
    }

    
}

