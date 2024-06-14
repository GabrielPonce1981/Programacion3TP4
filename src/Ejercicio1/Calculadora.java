package Ejercicio1;

import Ejercicio1.Exception.CalculadoraException;

public class Calculadora {

    private int numero;

    public Calculadora(int numero) {
        this.numero = numero;
    }

    public int calcularFactorial(int numero) throws CalculadoraException{
        int factorial = 1;

        if (numero < 0) {
            throw new CalculadoraException("El numero no puede ser negativo");
        }
        if(numero >= 12){
            throw new CalculadoraException("El numero no puede ser mayor o igual a 12");
        }
        
        if (numero == 0 || numero == 1) {
            return 1;
        }

        for (int i = 2; i <= numero; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
