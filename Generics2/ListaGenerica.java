package Generics2;

import java.util.AbstractList;
import java.util.Arrays;

public class ListaGenerica<E> extends AbstractList<E>{
    private static final int LONGITUD_BASE = 3;
    private E[] elementos;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public ListaGenerica(){
        elementos = (E[]) new Object[LONGITUD_BASE];
        
    }

    @Override
    public E get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index);
        }
        return elementos[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E set(int index, E element){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index);
        }
        E oldElement = elementos[index];
        elementos[index]=element;
        return oldElement;
    }

    @Override
    
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index);
        }
        if (estructuraLlena()) {
            elementos = Arrays.copyOf(elementos, size + LONGITUD_BASE);
        }
        System.arraycopy(elementos, index, elementos, index + 1, size - index);
        elementos[index] = element;
        size++;
    }
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        E oldElement = elementos[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementos, index + 1, elementos, index, numMoved);
        }
        elementos[--size] = null;
        return oldElement;
    }

    public boolean esVacia() {
        return size == 0;
    }

    private boolean estructuraLlena() {
        return size == elementos.length;
    }



}













