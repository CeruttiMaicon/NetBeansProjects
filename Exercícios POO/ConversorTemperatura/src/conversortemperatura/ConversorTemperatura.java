/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversortemperatura;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class ConversorTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Precione C para converter de Fahrenheit para Celsius.");
        System.out.println("Precione F para converter de Celsius para Fahrenheit");
        System.out.print("Sua escolha: ");
        String opcao = scan.next();
        
        if (("C".equals(opcao)) || ("c".equals(opcao))){
            System.out.print("Por favor informe a temperatura em Fahrenheit: ");
            int temp = scan.nextInt();
            
            int resultado = (temp - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius é " + resultado);
        }else{
        if ("F".equals(opcao) || "f".equals(opcao)){
            System.out.println("Por favor informe a temperatura em Celsius");
            int temp = scan.nextInt();
            
            int resultado = (temp * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheith é " + resultado);
                    
            }
        }
        
        
        
        
        
        
        
        
        
    }
    
}
