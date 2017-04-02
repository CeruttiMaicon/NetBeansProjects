/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Maicon
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é " + m);*/
        
        float v = 8.4f;
        int ar = (int) Math.round(v); // Arredondamento Aritmetico
        /* 
        int ar = (int) Math.abs(v);  // Arredondamento Absoluto - Transforma para numeros positivos
        int ar = (int) Math.floor(v); // Arredondamento para Baixo
        int ar = (int) Math.ceil(v);  // Arredondamento para Cima
        
        
        */
        
        System.out.println(ar);
    }
    
}
