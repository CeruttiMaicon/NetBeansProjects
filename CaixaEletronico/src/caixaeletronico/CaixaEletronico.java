/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float saldo = 0f ;
        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindos ao Banco Java");
        System.out.println("Seu saldo atual é de R$ "+ formatador.format(saldo));
        System.out.println("Qual o valor que deseja depositar?");
        System.out.print("Informe o valor: ");
        float deposito = scan.nextFloat();
        saldo = saldo + deposito;
        System.out.println("Seu saldo atual é R$ " + formatador.format(saldo));
        System.out.println("Qual o valor que deseja sacar?");
        System.out.print("Informe o valor R$: ");
        float retirada = scan.nextFloat();
        saldo = saldo - retirada;
        System.out.println("Seu saldo atual é R$ " + formatador.format(saldo));
        System.out.println("Banco Java agradece sua preferência.");
        
        
        
    }
    
}
