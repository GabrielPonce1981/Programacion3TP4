package Ejercicio3;

import java.util.ArrayList;

public class RecursividadInciso3 {


     private ArrayList<Integer> lista;
     private int indice;

    public RecursividadInciso3(int indice)
    {
        this.lista = new ArrayList<Integer>();
        this.indice = indice;
    }

    public void agregarNumero(int numero){
        lista.add(numero);
    }

    public boolean esCreciente(ArrayList<Integer> lista, int indice){
        if(indice == lista.size() -1){//condicion base
            return true;
        }

        if(lista.get(indice) > lista.get(indice + 1)){
            return false;
        }

        return esCreciente(lista, indice + 1);
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
   
}
