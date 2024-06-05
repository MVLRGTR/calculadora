/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author mvlrg
 */
public class Calculadora {

    private double valorA;
    private double valorB;
    
    public Calculadora(){
        this(0.0,0.0);
    }
    
    public Calculadora(double valorA , double valorB){
        setValorA(valorA);
        setValorB(valorB);
    }
    
    public double getValorA() {return valorA;}
    public double getValorB() {return valorB;}
    
    public void setValorA(double valorA) {this.valorA = valorA;}
    public void setValorB(double valorB) {this.valorB = valorB;}
    
    public double getAdicao(){
        return(getValorA()+ getValorB());
    }
    
    public double getSubtracao(){
        return(getValorA()- getValorB());
    }
    
    public double getProduto(){
        return(getValorA()* getValorB());
    }
    
    public double getDivisao(){
        return(getValorA()/ getValorB());
    }
}
