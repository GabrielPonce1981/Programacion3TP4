package Ejercicio1.Exception;

public class CalculadoraException extends Exception {

    private String mensaje;

    public CalculadoraException(String mensaje) {
        setMensaje(mensaje);//agregamos el set al constructor para setear el mensaje de la excepcion
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return getMensaje();//ponemos el mensaje por cada excepcion
    }

}
