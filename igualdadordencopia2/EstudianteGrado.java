package igualdadordencopia2;


public class EstudianteGrado extends Estudiante {
    //crear una clase EstudianteGrado que herede de Estudiante y agregue los siguientes atributos:
    //String carreraGrado
    //Constructor que inicialice nombre, edad, matrícula, y carrera de grado.
    String carreraGrado;
    

    public EstudianteGrado(String nombre, int edad, int matricula, String carreraGrado){
        super(nombre, edad);
        this.matricula=matricula;
        this.carreraGrado= carreraGrado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        EstudianteGrado that = (EstudianteGrado) obj;
        return matricula == that.matricula && carreraGrado.equals(that.carreraGrado);
    }


}
