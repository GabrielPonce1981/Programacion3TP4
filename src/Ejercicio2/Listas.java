package Ejercicio2;


import java.util.ArrayList;
import java.util.List;

public class Listas{

    private ArrayList<String> listaString = new ArrayList<>();

    public Listas() {
    }

    public void agregarElemento(String elemento) {
        listaString.add(elemento);
    }   
    
    public void eliminarElemento(String elemento) {
        listaString.remove(elemento);
    }

    public String mostrarElemento(int indice){
        if(indice < 0 || indice >= listaString.size()){
            //lanzamos la excepcion si el indice esta fuera del rango de la lista
            throw new IndexOutOfBoundsException("El indice debe estar entre 0 y " + listaString.size());
        }
        //devolvemos el elemento en el indice ingresado
        return listaString.get(indice);
    }
    
    
    public List<String> getListaString() {
        return listaString;
    }

    public void setListaString(ArrayList<String> listaString) {
        this.listaString = listaString;
    }


    

}
