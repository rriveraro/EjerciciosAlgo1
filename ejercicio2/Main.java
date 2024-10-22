package ejercicio2;

public class Main {
    public static void main(String[] args) {
        //libros libro1 = new libros("Originals", "Adam Grant");

        //libros libro2 = new libros("Un mundo feliz", "Aldous Huxley", 1932);
        //libro1.saludar();
        //libro2.saludar();
        String[] materias = {"Probabilidad y Estadistica I", "Algoritmos I"};

        Estudiante rocio = new Estudiante("Rocio", 24, "Licenciatura en Cs. De Datos", materias);

        //rocio.informar();
        rocio.toString();
    }
}
