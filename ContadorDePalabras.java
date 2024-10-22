import java.util.Scanner;

public class ContadorDePalabras {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase:");
        String frase = scanner.nextLine();


        String inputSeparador = scanner.nextLine(); // Usar nextLine() para aceptar espacios
        
        // Asegurarse de que el separador no esté vacío
        if (inputSeparador.isEmpty()) {
            System.out.println("No ingresó un separador válido.");
        }
        
        // Tomar el primer carácter ingresado como separador
        char separador = inputSeparador.charAt(0);

        int contador = 1;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == separador){
                contador = contador + 1;
            }
        }

        System.out.println("Cantidad de palabras: " + contador);


        scanner.close();
    }
    
}
