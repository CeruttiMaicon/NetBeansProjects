/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosramdomicospoo;

import java.util.Random;

/**
 *
 * @author Maicon
 */
public class NumerosRamdomicosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random gerador = new Random();
        
        for (int i = 0; i < 10 ; i++){
            
            //Gera um numero aleatorio entre 0 e             
            System.out.println(gerador.nextInt(5));
        }
            
    }
    
}
