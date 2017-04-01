/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacorepeticao;

/**
 *
 * @author Maicon
 */
public class LacoRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Laço while");
        
        int contador = 0;
        //Testar antes de executar
        while (contador < 10){
            contador += 1;
            System.out.println("Contador = " + contador);
        }
        
    }
    
}
