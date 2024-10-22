import java.util.Scanner;

public class SumaNumerosPares {
    public static void main(String[] args){

        //Suma de Números Pares: Escribir un programa que calcule la suma de todos los números pares entre 1 y un número ingresado por consola. Recordar validar que el número ingresado sea positivo. Ejemplo de entrada/salida:
        //Ingrese un número positivo: 10
        //La suma de los números pares del 1 al 10 es: 30

        //1ero debe ingresar un numero. Validamos que sea positivo. Se me ocurre que usemos un for desde 1 hasta n y que veamos si es par con la función modulo.

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (num == 0){
            System.out.print("Ingerese un número positivo: ");
            num = scanner.nextInt();

            if (num<1){
                num = 0;
            }
        }
        //System.out.print("Ingerese un número positivo: ");
        //int num = scanner.nextInt();

        int suma = 0;
        int i;

        for (i=1; i<=num; i++){

            if (i%2 == 0){
                suma = suma + i;
            }
        }

        System.out.println("La suma de los numeros pares de 1 al " + num + "es: " + suma);
        
        scanner.close();

    }
    
}
