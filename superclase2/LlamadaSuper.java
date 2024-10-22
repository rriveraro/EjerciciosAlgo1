package superclase2;

class FigurasGeometricas {
    String nombre;
    public FigurasGeometricas(String nombre) {
        this.nombre = nombre;
    }
    public void calcularArea(){
        System.out.print("Area de la figura: ");
    } 
}
class Circulo extends FigurasGeometricas {
    double radio;
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    public void calcularArea(){
        super.calcularArea();
        double area = Math.PI * (radio * radio) ;
        System.out.println("El area es:" + area);
    }
}
class Rectangulo extends FigurasGeometricas{
    double base;
    double altura;
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this. altura = altura;
    }
    public void calcularArea(){
        super.calcularArea();
        double area = base * altura;
        System.out.println("El area es:" + area);
    }
}
public class LlamadaSuper {
    public static void main(String[] args){
        Rectangulo rectangulo = new Rectangulo("rectangulo", 2,3);
        rectangulo.calcularArea();
        Circulo circulo = new Circulo("circulo",3);
        circulo.calcularArea();
    }
}
