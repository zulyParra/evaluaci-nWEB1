/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionweb1;

/**
 *
 * @author DELL_COREI5
 */
public class ClsEcuacion2x2 {
    private double valorX;
    private double valorY;
    private double a1;
    private double b1;
    private double c1;
    private double a2;
    private double b2;
    private double c2;

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }

    public void setC3(double c2) {
        this.c2 = c2;
    }
    

    public double getValorX() {
        return valorX;
    }

    public double getValorY() {
        return valorY;
    }
    
    public void resolverEcuacion(){
        valorX = ((c1 * b2) - (c2 * b1)) / ((a1 * b2) - (a2 * b1));
        valorY = ((a1 * c2) - (a2 * c1)) / ((a1 * b2) - (a2 * b1));
    }
}
