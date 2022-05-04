/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector;

/**
 *
 * @author zelle
 */
public class Vector3 {

    double x1, x2, x3;


    public Vector3(double x1, double x2, double x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public Vector3() {
        x1 = x2 = x3 = 0;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public double[] getValues() {
        double[] temp = {x1, x2, x3};
        return temp;
    }

    public void setValues(double[] arr) {
        x1 = arr[0];
        x2 = arr[1];
        x3 = arr[2];
    }

    public void setValues(double x1, double x2, double x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }
    
    
    
    public double abs(){
        return Math.sqrt( Math.pow(x1, 2) + Math.pow(x2, 2) + Math.pow(x3, 2));
    }
}
