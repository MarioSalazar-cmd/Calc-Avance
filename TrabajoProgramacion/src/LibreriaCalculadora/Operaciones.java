/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreriaCalculadora;
import java.lang.Math;

/**
 *
 * @author sebas
 */
public class Operaciones {
    public double operacion1,operacion2,resultado;
    public String variable;

    public Operaciones() {
    }
    

    public double getOperacion1() {
        return operacion1;
    }

    public double getOperacion2() {
        return operacion2;
    }

    public double getResultado() {
        return resultado;
    }
    public String getVariable() {
        return variable;
    }

    public void setOperacion1(double operacion1) {
        this.operacion1 = operacion1;
    }

    public void setOperacion2(double operacion2) {
        this.operacion2 = operacion2;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void setVariable(String variable) {
        this.variable = variable;
    }
   
    
    public double suma(){
        resultado=operacion1+operacion2;
        return resultado;
    }
    public double resta(){
        resultado=operacion1-operacion2;
        return resultado;
    }
    public double multiplicacion(){
        resultado=operacion1*operacion2;
        return resultado;
    }
    public double division(){
        resultado=operacion1/operacion2;
        return resultado;
    }
    public double porcentaje(){
        resultado=operacion1/100;
        return resultado;
    }
    public double raizCuadrada(){
        int resultado =(int)Math.sqrt(operacion1);
        return resultado;   
    }
    public double denominador(){
        resultado=1/operacion1;
        return resultado;
    }
    public double seno(){
        resultado=Math.sin(operacion1);
        return resultado;
    }
    public double coseno(){
        resultado=Math.cos(operacion1);
        return resultado;
    }
    public double tan(){
        resultado=Math.tan(operacion1);
        return resultado;
    }
    public double vartovar(){
        resultado=Math.pow(operacion1,operacion2);
        return resultado;
    }
}
