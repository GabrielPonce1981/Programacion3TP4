package logica;

import java.util.ArrayList;
import java.util.List;

public class ListaTareasLogica {

    private List<Tarea> listaTareas = new ArrayList<>();

    public Tarea crearTarea(Tarea t){
        listaTareas.add(t);
        System.out.println("Se cargó una nueva tarea a la lista" + t.getNombre());
        return t;
    }

    public void eliminarTarea(Tarea t) {
        listaTareas.remove(t);
        System.out.println("Se eliminó una tarea de la lista" + t.getNombre());
    }

    //editar tarea
    public void editarTarea(Tarea t, String nombre) {
        t.setNombre(nombre);
        System.out.println("Se editó una tarea de la lista" + t.getNombre());
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }
}
