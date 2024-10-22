package Generics;

public class Contenedor<T> {
    private T elemento;

    public Contenedor(T elemento){
        this.elemento = elemento;
    }
    
    public Contenedor() {
    }


    //metodo para agregar un elemento
    public void agregar(T elemento){
        this.elemento = elemento;
    }

    //quitar un elemento:
    public void quitar(){
        this.elemento = null;
    }

    //verificar si el contenedor esta vacio:
    public boolean estaVacio(){
        return this.elemento == null;
    }

    //visualizar el elemento dentro del contenedor
    public T obtenerElemento(){
        return this.elemento;
    }

    //comparar si el eleento dentro del contenedor es igual a otro elemento
    public boolean esIgual(T otroElemento){
        if(this.elemento == null){
            return otroElemento == null;
        }
        return this.elemento.equals(otroElemento);
    }
}
