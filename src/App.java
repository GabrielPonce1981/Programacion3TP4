import Ejercicio1.Calculadora;
//import java.util.Scanner;
import Ejercicio1.Exception.CalculadoraException;


public class App {
    public static void main(String[] args) throws Exception {
        int opcion;  
        

        do{
            System.out.print("Ingrese un numero entero del 1 al 11 o 0 para salir: ");
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un numero entero positivo:");
                    int num = Integer.parseInt(System.console().readLine());
                    Calculadora calculadora = new Calculadora(num);

                    try {
                        System.out.println("El factorial de " + num + " es: " + calculadora.calcularFactorial(num));
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
            
                default:
                    break;
            }

        }while(opcion != 0 );

    }
}
