import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingerese el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el operador (+, - , *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operador){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();

    }
    
    
}
