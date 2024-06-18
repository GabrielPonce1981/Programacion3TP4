import Ejercicio1.Calculadora;

import Ejercicio2.Listas;
import Ejercicio3.RecursividadInciso1;


public class App {

    public static void main(String[] args) throws Exception {
        int opcion;  
        

        do{

            System.out.println("----------------Menu--------------");
            System.out.println("------------Ejercicio 1-----------");
            System.out.println("------------Ejercicio 2-----------");
            System.out.println("------------Ejercicio 3-----------");
            System.out.println("------------Ejercicio 4-----------");
            System.out.println("------------Ejercicio 5-----------");
            System.out.println("------------Ejercicio 6-----------");
            System.out.println("------------Ejercicio 7-----------");
            System.out.println("------------Ejercicio 8-----------");
            System.out.println("------------Ejercicio 9-----------");
            System.out.println("------------Ejercicio 10----------");
            System.out.println("------------Ejercicio 11----------");

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
                    
                case 2:
                    Listas lista = new Listas();
                    

                    lista.agregarElemento("A");
                    lista.agregarElemento("B");
                    lista.agregarElemento("C");
                    lista.agregarElemento("D");
                    lista.agregarElemento("E");
                    lista.agregarElemento("H");

                    System.out.println("Lista: " + lista.getListaString());

                    do {

                        System.out.println();
                        System.out.println("---Menu de acciones para la lista---");
                        System.out.println("---------1. Agregar elemento--------");
                        System.out.println("---------2. Eliminar elemento-------");
                        System.out.println("---------3. Mostrar elemento--------");
                        System.out.println("---------4. Mostrar lista-----------");
                        System.out.println("---------5. Salir-------------------");
                        System.out.println();
                        System.out.print("Ingrese una opcion del 1 al 4, 5 para salir: ");
                        opcion = Integer.parseInt(System.console().readLine());
    
                        switch (opcion) {
                            case 1:
                                System.out.print("Ingrese un elemento a agregar a la lista: ");
                                lista.agregarElemento(String.valueOf(System.console().readLine()));
                                break;
                            case 2:
                                System.out.print("Ingrese un elemento a eliminar de la lista: ");
                                lista.eliminarElemento(String.valueOf(System.console().readLine()));
                                break;
                            case 3:
                                System.out.print("Ingrese un numero paras acceder al indice de la lista: ");
                                int indice = Integer.parseInt(System.console().readLine());
                                try{
                                    System.out.println("El elemento en el indice " + indice + " es: " + lista.mostrarElemento(indice));
                                }
                                catch(Exception e){
                                    e.printStackTrace();
            
                                }
                                break;
                            case 4:
                                System.out.println();
                                System.out.println("Lista: " + lista.getListaString());
                                break;

                            default:
                                break;
                        }
                        
                    } while (opcion!= 5);

                    break;

                case 3:
                 
                    do {
                        System.out.println();
                        System.out.println("--------------------Menu Ejercicios Recursividad-------------------");
                        System.out.println("------------1. Cadena de caracteres en Lista de cadenas------------");
                        System.out.println("------------2. Contar la cantidad de impares en uan lista----------");
                        System.out.println("------------3. Determinar si una lista de enteros es creciente-----");
                        System.out.println("------------4. Determinar el maximo de una lista de valores--------");
                        System.out.println("------------5. Salir-------------------");
                        System.out.println();
                        
                  

                        System.out.println("Ingrese una opcion del 1 al 4 y 5 para salir: ");
                        opcion = Integer.parseInt(System.console().readLine());

                            switch (opcion) {
                                case 1:
                                    RecursividadInciso1 recursividad = new RecursividadInciso1();

                                    recursividad.agregarCadena("Hola mundo");
                                    recursividad.agregarCadena("es momento de programar");
                                    recursividad.agregarCadena("en Java");
                                    recursividad.agregarCadena("con recursividad");
                
                                    System.out.println("Lista de cadenas: " + recursividad.getListaDeCadenas());
                                    System.out.println();

                                    System.out.println("Ingrese una cadena a buscar: ");
                                    String cadena = String.valueOf(System.console().readLine());
                                    int indice = 0;

                                    String resultado = recursividad.buscarCadena(recursividad.getListaDeCadenas(), cadena, indice);

                                   if(resultado== null){
                                    System.out.println("La cadena " + cadena + " no se encuentra en la lista");
                                    }

                                    break;
                                case 2:
                                break;        

                                default:
                                break;
                            }    

                    } while (opcion!= 5);
                    
                    break;
                    

                    default:
                    break;
            }

        }while(opcion != 0 );

    }
}

