/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoespoo;

import java.util.Random;

/**
 *
 * @author Maicon
 */
public class FuncoesPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        olaMundo();
        olaMundo();
        
        
    }
    
    
    public static void olaMundo(){
        System.out.println("Olá mundo hu3h3uhu3uh3h");
    }
    public static int obterNumeroAleatorio (int valorMaximo){
        Random ramdom = new Random();
        return ramdom.nextInt(valorMaximo);
    }
}
