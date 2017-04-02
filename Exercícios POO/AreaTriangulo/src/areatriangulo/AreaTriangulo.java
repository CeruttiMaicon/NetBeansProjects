/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatriangulo;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here,
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o tamanho da base: ");
        int base = scan.nextInt();
        System.out.print("Informe o tamanho da altura: ");
        int altura = scan.nextInt();
        int area = altura * base / 2;
        System.out.println("A aréa do Triangulo é " + area);
              
    }
    
}
