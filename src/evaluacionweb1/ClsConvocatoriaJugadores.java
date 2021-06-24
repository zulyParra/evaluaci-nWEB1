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
public class ClsConvocatoriaJugadores {
     Scanner objLeer = new Scanner(System.in);
    boolean bandera = false;

    public String[] agregarJugador(int n) {
        String[] productos = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Por favor ingrese el nombre del jugador " + (i + 1) + ": ");
            productos[i] = objLeer.next();
        }
        return productos;
    }


    public boolean buscarJugador(String[] productos, String nombreProducto) {
        for (int i = 0; i < productos.length; i++) {
            if (nombreProducto.equals(productos[i])) {
                bandera = true;
                break;
            } else {
                bandera = false;
            }
        }
        return bandera;
    }

    public boolean editarJugador(String[] productos, String nombreProducto) {
        String nuevoProducto;
        for (int i = 0; i < productos.length; i++) {
            if (nombreProducto.equals(productos[i])) {
                System.out.println("Dijte el nombre del nuevo jugador: ");
                nuevoProducto = objLeer.next();
                productos[i] = nuevoProducto;
                bandera = true;
                break;
            } else {
                bandera = false;
            }
        }
        return bandera;
    }

    public void imprimirJugador(String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
