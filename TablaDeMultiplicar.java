import java.util.Scanner;

public class TablaDeMultiplicar {

    //Tabla de Multiplicar: Escribir un programa que solicite un número y luego muestre la tabla de multiplicar del 1 al 10 para ese número.
    //Ejemplo de entrada/salida:
    //Ingrese un número: 7
    //Tabla de multiplicar del 7:
    //7 x 1 = 7
    //...
    //7 x 10 = 70
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingerese un número: ");
        int num = scanner.nextInt();
        int i;

        System.out.println("Tabla de multiplicar del " + num + ":");
        for (i=1; i<=10; i++){
            int resultado = i*num;
            System.out.println(num + " x " + i + " = " + resultado); 
        }

        scanner.close();

    }
}
