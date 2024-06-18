package Ejercicio3;

import java.util.ArrayList;

public class RecursividadInciso1 {

    private ArrayList<String> listaDeCadenas;
    private int indice;

    public RecursividadInciso1() {
        listaDeCadenas = new ArrayList<>();
    }

    public void agregarCadena(String cadena) {
        listaDeCadenas.add(cadena);
    }
    

    public String buscarCadena(ArrayList<String> lista, String cadena, int indice) {
        if (indice == listaDeCadenas.size()) { //indice debe ser menor que la lista
            return null;
        }
        else if (listaDeCadenas.get(indice).equals(cadena)) {
            String resultado = listaDeCadenas.get(indice);
            
            System.out.println( "El resultado de la busqueda es: " + resultado + " y se encuentra en la posicion " + indice +  " de la lista");
            System.out.println();
            return resultado;
        }
        else {
            return buscarCadena(listaDeCadenas, cadena, indice + 1);
        }
        
    }


    public ArrayList<String> getListaDeCadenas() {
        return listaDeCadenas;
    }

    public void setListaDeCadenas(ArrayList<String> listaDeCadenas) {
        this.listaDeCadenas = listaDeCadenas;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    
    

}
