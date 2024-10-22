package igualdadordencopia2;


public class EstudiantePosgrado extends Estudiante {

    //Crear una clase EstudiantePosgrado que herede de Estudiante y agregue los siguientes atributos:
    //String carreraPosgrado
    //Constructor que inicialice nombre, edad, matrícula, y carrera de posgrado.
    
    String carreraPosgrado;

    public EstudiantePosgrado(String nombre, int edad, int matricula, String carreraPosgrado){
        super(nombre, edad);
        this.matricula = matricula;
        this.carreraPosgrado = carreraPosgrado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        EstudiantePosgrado that = (EstudiantePosgrado) obj;
        return matricula == that.matricula && carreraPosgrado.equals(that.carreraPosgrado);
    }


}
