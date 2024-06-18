import Ejercicio1.Calculadora;

import Ejercicio2.Listas;


public class App {

    public static void main(String[] args) throws Exception {
        int opcion;  
        

        do{

            System.out.println("----------------Menu--------------");
            System.out.println("------------Ejercicio 1-----------");
            System.out.println("------------Ejercicio 2-----------");
            System.out.println("------------Ejercicio 3-----------");
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
                        System.out.println("1. Agregar elemento");
                        System.out.println("2. Eliminar elemento");
                        System.out.println("3. Mostrar elemento");
                        System.out.println("4. Mostrar lista");
                        System.out.println("5. Volver al menu principal");
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
