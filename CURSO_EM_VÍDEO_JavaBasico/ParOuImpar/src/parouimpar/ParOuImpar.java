/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parouimpar;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class ParOuImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int num1 = scan.nextInt();
        if (num1 % 2 == 0){
            System.out.println("O numero " + num1 + " é par.");
        }else{
            System.out.println("O numero " + num1 + " é impar");
        }
    }
    
}
