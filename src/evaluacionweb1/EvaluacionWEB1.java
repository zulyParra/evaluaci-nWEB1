/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionweb1;

import java.util.Scanner;

/**
 *
 * @author DELL_COREI5
 */
public class EvaluacionWEB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objLeer = new Scanner(System.in);

        
        //------------------------------------//
        //---------Ecuacion2x2----------------//
        //------------------------------------//
//        double a1, a2, b1, b2, c1, c2;
//        System.out.println("Resolver un sistema de 2x2");
//        System.out.println("a1X + b1Y = c1");
//        System.out.println("a2X + b2Y = c2");
//        System.out.print("Digite el valor de a1: ");
//        a1 = objLeer.nextDouble();
//        System.out.print("Digite el valor de b1: ");
//        b1 = objLeer.nextDouble();
//        System.out.print("Digite el valor de c1: ");
//        c1 = objLeer.nextDouble();
//        System.out.print("Digite el valor de a2: ");
//        a2 = objLeer.nextDouble();
//        System.out.print("Digite el valor de b2: ");
//        b2 = objLeer.nextDouble();
//        System.out.print("Digite el valor de c2: ");
//        c2 = objLeer.nextDouble();
//        
//        ClsEcuacion2x2 objEcuacion2x2 = new ClsEcuacion2x2();
//        objEcuacion2x2.setA1(a1);
//        objEcuacion2x2.setB1(b1);
//        objEcuacion2x2.setC1(c1);
//        objEcuacion2x2.setA2(a2);
//        objEcuacion2x2.setB2(b2);
//        objEcuacion2x2.setC3(c2);
//        objEcuacion2x2.resolverEcuacion();
//        System.out.println("El valor de X es: " + objEcuacion2x2.getValorX());
//        System.out.println("El valor de Y es: " + objEcuacion2x2.getValorY());
        //------------------------------------//
        //----------contar negativos----------//
        //------------------------------------//
//        ClsContarNegativos objContarNegativos = new ClsContarNegativos();
//        System.out.println("Por favor ingrese 20 números");
//        System.out.println("La cantidad de numeros negativos ingresados es: " + objContarNegativos.contarNegativos());
        //------------------------------------//
        //---------sumar columnas-------------//
        //------------------------------------//
//        int filas,columnas;
//        System.out.print("Por favor digite el numero de filas: ");
//        filas = objLeer.nextInt();
//        System.out.print("Digite el número de columnas: ");
//        columnas = objLeer.nextInt();
//        
//        int [][] matriz = new int[filas][columnas];
//        
//        for (int i = 0; i < filas; i++) {
//            for (int j = 0; j < columnas; j++) {
//               System.out.println("Por favor digite los valores para la matriz en la posicion fila " + i + " columna " + j + " : "); 
//               matriz[i][j] = objLeer.nextInt();
//            }
//        }
//        
//        int suma,s;
//        for (int j = 0; j < columnas; j++) {
//            suma = 0;
//            for (int i = 0; i < filas; i++) {
//                suma += matriz[i][j];
//            }
//            System.out.println("Suma columna " + j + " = " + suma);
//        }
//        System.out.println("");
        
        //------------------------------------//
        ClsConvocatoriaJugadores objConvocatoriaJugadores = new ClsConvocatoriaJugadores();
                
        int opcion,n=1,contador=0;
        String jugador;
        boolean bandera;
        String[] jugadores = new String[n];

        do {
            System.out.println("--------Bienvenido-------");
            System.out.println("---1. Agregar jugador---");
            System.out.println("---2. Buscar jugador----");
            System.out.println("---3. Editar jugador----");
            System.out.println("---4. Mostrar jugador-");
            System.out.println("---5. Salir--------------");

            System.out.print("\nDigite una opción: ");
            opcion = objLeer.nextInt();
            
//            if(opcion == 1){
//                contador++;
//            }
            
            switch (opcion) {
                case 1:
                        System.out.print("Por favor digite la cantidad de jugadores que va a ingresar: ");
                        n = objLeer.nextInt();
                        jugadores = objConvocatoriaJugadores.agregarJugador(n);
                    break;
                case 2:
                        System.out.print("Digite el nombre del jugador que desea buscar: ");
                        jugador = objLeer.next();
                        bandera = objConvocatoriaJugadores.buscarJugador(jugadores,jugador);
                        if (bandera) {
                            System.out.println("El jugador buscado si existe");
                        } else {
                            System.out.println("El jugador buscado no existe");
                        }
                    break;
                case 3:
                        System.out.print("Digite el nombre del jugador que desea editar: ");
                        jugador = objLeer.next();
                        if(objConvocatoriaJugadores.editarJugador(jugadores, jugador)){
                            System.out.println("jugador editado con exito");
                        }
                    break;
                case 4:
                        System.out.println("----Jugadores----");
                        objConvocatoriaJugadores.imprimirJugador(jugadores);
                        System.out.println("------------------");
                    break;
                case 5:
                    break;
                default: 
                    System.out.println("Digite una opción válida");
                    break;
            }
            
            
        } while (opcion != 5);
    }
    
}
