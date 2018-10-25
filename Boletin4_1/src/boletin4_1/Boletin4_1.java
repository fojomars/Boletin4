/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author fojomars
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche objeto1 = new Coche();
        
        //Devolve a velocidade actual
        System.out.println("La velocidad es: " + objeto1.getVelocidade());
        
        //Incremento da velocidade
        objeto1.acelerar(20);
        
        //Diminue a velocidade
        
        objeto1.frenar(50);
    }
    
}
