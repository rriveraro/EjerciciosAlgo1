package Polimorfismos2;


class CalculadoraAvanzada {
    public int sumar(int a, int b){
        return a+ b;
    } //para sumar dos números enteros.
    
    public double sumar(double a, double b){
        return a+b;
    }//para sumar dos números de punto flotante.
    public int restar(int a, int b) {
        return a-b;
    }//para restar dos números enteros.
    
    public double restar(double a, double b){
        return a-b;
    }// para restar dos números de punto flotante.

    public int multiplicar(int a, int b){
        return a*b;
    } //para multiplicar dos números enteros.
    
    public double multiplicar(double a, double b){
        return a*b;
    } //para multiplicar dos números de punto flotante.
    
    public int dividir(int a, int b){
        return a/b;
    } //para dividir dos números enteros.

    public double dividir(double a, double b){
        return a/b;
    } //para dividir dos números de punto flotante.
    
}

public class PruebaCalcu {
    public static void main(String[] args) {

        // Crear una instancia de CalculadoraAvanzada
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();

        System.out.println("Suma de enteros: " + calculadora.sumar(5, 7));
        System.out.println("Multiplicacion de enteros: " + calculadora.multiplicar(3, 6));
        System.out.println("Suma de dobles: " + calculadora.sumar(3.5, 2.8));
    }
}
