package Herencias;

class Viaje {

    int cantidadEstaciones;
    double distancia;
    int cantidadPasajeros;
    int cantidadVagones;
    int capacidadMaxima;

    public Viaje (double distancia, int cantidadEstaciones, int cantidadPasajeros, int cantidadVagones, int capacidadMaxima){
        this.distancia = distancia;
        this.cantidadEstaciones = cantidadEstaciones;
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadVagones = cantidadVagones;
        this.capacidadMaxima = capacidadMaxima;
    }

    public void tiempoDeDemora(){
        System.out.println("El tiempo de demora es: ");
    }
}

class ViajeDiesel extends Viaje{
    public ViajeDiesel (double distancia, int cantidadEstaciones, int cantidadPasajeros, int cantidadVagones, int capacidadMaxima){
        super(distancia, cantidadEstaciones, cantidadPasajeros, cantidadVagones, capacidadMaxima);
    }

    @Override
    public void tiempoDeDemora(){
        double tiempo = ((distancia * cantidadEstaciones)/2)+((cantidadEstaciones+cantidadPasajeros)/10);
        System.out.println("El tiempo de demora es: " + tiempo);
    }
}
class ViajeElectrico extends Viaje{
    public ViajeElectrico (double distancia, int cantidadEstaciones, int cantidadPasajeros, int cantidadVagones, int capacidadMaxima){
        super(distancia, cantidadEstaciones, cantidadPasajeros, cantidadVagones, capacidadMaxima);
    }
    @Override
    public void tiempoDeDemora(){
        double tiempo = (distancia*cantidadEstaciones)/2;
        System.out.println("El tiempo de demora es:" + tiempo);
    }
}
class ViajeAltaVelocidad extends Viaje{
    public ViajeAltaVelocidad (double distancia, int cantidadEstaciones, int cantidadPasajeros, int cantidadVagones, int capacidadMaxima){
        super(distancia, cantidadEstaciones, cantidadPasajeros, cantidadVagones, capacidadMaxima);
    }
    @Override
    public void tiempoDeDemora(){
        double tiempo = distancia/10;
        System.out.println("El tiempo de demora es:" + tiempo);
    }
}

public class PruebaViajes{
    public static void main(String[] args) {
        ViajeDiesel viaje1 = new ViajeDiesel(320,12, 200, 8, 200);
        ViajeElectrico viaje2 = new ViajeElectrico(50, 18, 500, 6, 500);
        ViajeAltaVelocidad viaje3 = new ViajeAltaVelocidad(200, 24, 130, 4, 130);

        viaje1.tiempoDeDemora();
        viaje2.tiempoDeDemora();
        viaje3.tiempoDeDemora();
    }
}