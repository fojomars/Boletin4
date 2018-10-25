/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author fojomars
 */
public class Circulo {
    //Atributos
    private double radio;
    private final double PI = 3.14;
    
    //Métodos sen parámetros
    public Circulo(){
    }
    
    //Métodos con parámetros
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public void calcularArea(){
        double area = PI * Math.pow(radio, 2);
        System.out.println("El área es: " + area);
    }
    public void calcularLonxitude(){
        double perimetro = 2 * PI * radio;
        System.out.println("El valor de la circunferencia es: " + perimetro);
    }
    
      
    
    
}
