package Ejercicio3;

import java.util.ArrayList;

public class RecursividadInciso2 {
    private ArrayList<Integer> listaDeNumeros;
    private int indice;

    public RecursividadInciso2() {
        listaDeNumeros = new ArrayList<>();
    }

    public void agregarCadena(int numero) {
        listaDeNumeros.add(numero);
    }

    int contador = 0;

    public int buscarCadena(ArrayList<Integer> listaDeNumeros, int posicion) {
        if (posicion >= listaDeNumeros.size()) {
            return contador;
        } else if (esImpar(listaDeNumeros.get(posicion))) {
            contador++;
        }
        posicion++;
        return buscarCadena(listaDeNumeros, posicion);
    }
    
    // public int buscarCadena(ArrayList<Integer> listaDeNumeros) {
    //     if (esImpar(listaDeNumeros.get(posicion)) && posicion < listaDeNumeros.size()) {
    //         contador++;
    //         posicion++;
    //         return buscarCadena(listaDeNumeros);
    //     } else if (!esImpar(listaDeNumeros.get(posicion)) && posicion < listaDeNumeros.size()) {
    //         posicion++;
    //         return buscarCadena(listaDeNumeros);
    //     } else {
    //         return contador;
    //     }
    // }


    public boolean esImpar(int numero) {
        if (numero % 2 == 0) {
            return false;
        }
        return true;
    }


    public ArrayList<Integer> getListaDeNumeros() {
        return listaDeNumeros;
    }

    public void setListaDeNumeros(ArrayList<Integer> listaDeNumeros) {
        this.listaDeNumeros = listaDeNumeros;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    
}
