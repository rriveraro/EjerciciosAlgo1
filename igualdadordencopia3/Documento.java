package igualdadordencopia3;

public class Documento {
    int numero;

    public Documento(int numero){
        this.numero = numero;
    }

    //Constructor de copia, para copia profunda
    public Documento(Documento original){
        this.numero=original.numero;
    }
    
}
