package Herencias2;

class TipoViaje{
    String tipo;

    public TipoViaje(String tipo){
        this.tipo = tipo;
    }

    public double tiempoDeDemora(Viaje viaje){
        switch (tipo.toLowerCase()){
            case "diesel":
                return (viaje.distancia * viaje.cantidadPasajeros/2)+(viaje.cantidadEstaciones + viaje.cantidadPasajeros/10);
            case "electrico":
                return (viaje.distancia * viaje.cantidadEstaciones/2);
            case "alta velocidad":
                return (viaje.distancia/10);
            default:
                return 0;
        }

    }
}

class Viaje {
    int cantidadEstaciones;
    double distancia;
    int cantidadPasajeros;
    int cantidadVagones;
    int capacidadMaxima;
    TipoViaje tipoViaje;

    public Viaje (double distancia, int cantidadEstaciones, int cantidadPasajeros, int cantidadVagones, int capacidadMaxima, TipoViaje tipoViaje){
        this.distancia = distancia;
        this.cantidadEstaciones = cantidadEstaciones;
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadVagones = cantidadVagones;
        this.capacidadMaxima = capacidadMaxima;
        this.tipoViaje = tipoViaje;
    }

    public double tiempoDeDemora(){
        return tipoViaje.tiempoDeDemora(this);
    }
}

public class PruebaViajes{
    public static void main(String[] args) {
        TipoViaje tipoDiesel = new TipoViaje("Diesel");
        Viaje viajeDiesel = new Viaje(300, 5, 200, 10, 500, tipoDiesel);
        System.out.println("Tiempo de demora para el viaje diesel: " + viajeDiesel.tiempoDeDemora() + "minutos.");
    }
}