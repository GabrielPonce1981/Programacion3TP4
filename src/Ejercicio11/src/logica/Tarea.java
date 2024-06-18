package logica;

public class Tarea {
    private String nombre;
    boolean tachado;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.tachado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public boolean isTachado() {
        return tachado;
    }

    public void setTachado() {
        this.tachado = !isTachado();
        System.out.println("Tachado is:" + isTachado());
    }
}
