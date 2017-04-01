/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somadointervalo;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class SomaDoIntervalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int inicio = 0;
        int fim = 0;
        int i = 0;
        int cont = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor Inicio: ");
        inicio = scan.nextInt();
        System.out.print("Digite o valor Fim");
        fim = scan.nextInt();
        
        
        for (i = inicio; i < fim; i++){
            int j = 0;
            j = i % 2;
            if(j == 1){
                cont += i;
            }           
        }
        System.out.println("Somente somando os Impares");
        System.out.println("O resultado é: " + cont);
    
    }
    
}
