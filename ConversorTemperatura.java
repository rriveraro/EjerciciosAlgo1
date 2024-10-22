import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingerese la temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Ingrese la unidad de temperatura (C/F): ");
        char unidad = scanner.next().toUpperCase().charAt(0);

        double temperaturaConvertida = 0;

        if (unidad == 'F'){
            temperaturaConvertida = ((temperatura - 32) * 5)/9;
            System.out.println("Temperatura en Celsius: " + temperaturaConvertida + "°C");
        }else if (unidad == 'C'){
            temperaturaConvertida = ((temperatura * 9) / 5) + 32;
            System.out.println("Temperatura en Farenheit: " + temperaturaConvertida + "°F");

        }

        scanner.close(); // SIEMPRE CERRAR EL SCANNER



    }


}
