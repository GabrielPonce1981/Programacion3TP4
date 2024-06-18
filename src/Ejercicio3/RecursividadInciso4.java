package Ejercicio3;

import java.util.ArrayList;

public class RecursividadInciso4 {

    private ArrayList<Integer> lista;
    private int indice;

    public RecursividadInciso4() {
        this.lista = new ArrayList<Integer>();
    }

    public void agregarElemento(int elemento) {
        this.lista.add(elemento);
    }
    
    
    int maximo = 0;
    public int buscarMaximo(ArrayList<Integer> lista, int indice){
        
        if(indice == lista.size()){
            return maximo;
        }

        if(lista.get(indice) > maximo){
            maximo = lista.get(indice);
        }
        
        return buscarMaximo(lista, indice + 1);

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
