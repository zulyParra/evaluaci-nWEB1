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
public class ClsContarNegativos {
    Scanner objLeer = new Scanner(System.in);
    public int contarNegativos(){
        int numero,contador = 0;
        int[] vectorNumeros = new int[20];
        for (int i = 0; i < vectorNumeros.length; i++) {
            System.out.print("Por favor ingrese el numero " + (i + 1) + ": ");
            numero = objLeer.nextInt();
            vectorNumeros[i] = numero;
            if (numero < 0) {
                contador++;
            }
        }
        return contador;
    }
}
