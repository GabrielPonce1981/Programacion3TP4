import Ejercicio1.Calculadora;

import Ejercicio2.Listas;
import Ejercicio3.RecursividadInciso1;
import Ejercicio3.RecursividadInciso2;
import Ejercicio3.RecursividadInciso3;
import Ejercicio3.RecursividadInciso4;

public class App {

    public static void main(String[] args) throws Exception {
        int opcion;  
        

        do{

            System.out.println("--------------- Menu-----------------");
            System.out.println("---------- 1. Ejercicio 1 -----------");
            System.out.println("---------- 2. Ejercicio 2 -----------");
            System.out.println("---------- 3. Ejercicio 3 -----------");
            System.out.println("---------- 4. Salir -----------------");

            System.out.print("Ingrese la opcion deseada: ");
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
                    System.out.println();
                    System.out.println("Ingrese cualquier tecla para volver al menu principal...");
                    System.console().readLine();
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
                        System.out.print("Ingrese la opcion deseada: ");
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
                                System.out.print("Ingrese un numero para acceder al indice de la lista: ");
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
                        System.out.println("------------2. Contar la cantidad de impares en una lista----------");
                        System.out.println("------------3. Determinar si una lista de enteros es creciente-----");
                        System.out.println("------------4. Determinar el maximo de una lista de valores--------");
                        System.out.println("------------5. Salir-------------------");
                        System.out.println();
                        
                  

                        System.out.print("Ingrese la opcion deseada: ");
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

                                    System.out.print("Ingrese una cadena a buscar: ");
                                    String cadena = String.valueOf(System.console().readLine());
                                    int indice = 0;

                                    String resultado = recursividad.buscarCadena(recursividad.getListaDeCadenas(), cadena, indice);

                                   if(resultado == null){
                                    System.out.println("La cadena " + cadena + " no se encuentra en la lista");
                                    }

                                    break;
                                case 2:
                                    RecursividadInciso2 recursividad2 = new RecursividadInciso2();

                                    recursividad2.agregarCadena(1);
                                    recursividad2.agregarCadena(2);
                                    recursividad2.agregarCadena(3);
                                    recursividad2.agregarCadena(4);
                                    recursividad2.agregarCadena(5);

                                    System.out.println();
                                    System.out.println("Lista de enteros: " + recursividad2.getListaDeNumeros());

                                    int resultado2 = recursividad2.buscarCadena(recursividad2.getListaDeNumeros(), 0);

                                    System.out.println("La cantidad de impares en la lista es: " + resultado2);

                                    break;   
                                
                                case 3:
                                    RecursividadInciso3 array = new RecursividadInciso3(0);

                                    array.agregarNumero(1);
                                    array.agregarNumero(2);
                                    array.agregarNumero(3);
                                    array.agregarNumero(4);
                                    array.agregarNumero(5);
                                    array.agregarNumero(6);
                                    
                                    boolean listaCreciente = array.esCreciente(array.getLista(), array.getIndice());

                                    System.out.println("Lista de enteros: " + array.getLista());

                                    if (listaCreciente == true) {
                                        System.out.println("La lista es creciente");
                                    } else {
                                        System.out.println("La lista no es creciente");   
                                    }

                                    break;



                                case 4:
                                    RecursividadInciso4 lista2 = new RecursividadInciso4();

                                    lista2.agregarElemento(18);
                                    lista2.agregarElemento(2);
                                    lista2.agregarElemento(35);
                                    lista2.agregarElemento(400);
                                    lista2.agregarElemento(55);
                            
                                    System.out.println(lista2.getLista());
                            
                                    System.out.println("El maximo de la lista es: " + lista2.buscarMaximo(lista2.getLista(), 0));   

                                    break;    

                                default:
                                break;
                            }    

                    } while (opcion!= 5);
                    
                    break;
                    

                    default:
                    System.out.println();
                    System.out.println("Opcion incorrecta. Intente nuevamente...");
                    System.out.println();
                    break;
            }

        }while(opcion != 4 );

    }
}

