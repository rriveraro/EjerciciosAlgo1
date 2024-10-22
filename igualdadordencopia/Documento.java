package igualdadordencopia;

import java.time.LocalDate;

public final class Documento {
    //Implementar la clase Documento con un único constructor que acepta el número del documento, luego la fecha de emisión será la fecha actual del sistema y su vencimiento será la actual + 10 años.
    private final int numero;
    private final LocalDate fechaActual;
    private final LocalDate fechaVencimiento;

    public Documento(int numero){
        this.numero = numero;
        this.fechaActual = LocalDate.now();
        this.fechaVencimiento = fechaActual.plusYears(10);
    }

    //Agregar el comportamiento de renovar documento, el cual devuelve un nuevo documento con el mismo número pero fecha de emisión actual y vencimiento actualizadas.

    public Documento renovarDocumento(){
        return new Documento(this.numero);  // Crear un nuevo Documento con el mismo número pero fechas actualizadas

    }
    public int getNumero(){
        return numero;
    }
    public LocalDate getfechaActual() {
        return fechaActual;
    }

    public LocalDate getfechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Documento: " + numero + " (Emisión: " + fechaActual + ", Vencimiento: " + fechaVencimiento + ")";
    }

}
