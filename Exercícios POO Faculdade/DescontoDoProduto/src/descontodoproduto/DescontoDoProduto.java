
package descontodoproduto;

import java.util.Scanner;


public class DescontoDoProduto {

    public static void main(String[] args) {
        
        
        double num1;
        int cod;
        double desconto = 0;
        double valorcomdesconto;
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor do Produto");
        num1 = scan.nextInt();
        
        System.out.println("Informe o código de desconto d produto");
        System.out.println("____________________________________________________");
        System.out.println("| Código |     percentual de desconto ");
        System.out.println("____________________________________________________");
        System.out.println("|   1    |                5 %   ");
        System.out.println("|   2    |                10%   ");
        System.out.println("|   3    |                20%   ");
        System.out.println("|   4    |                50%   ");
        System.out.println("____________________________________________________");
        System.out.print("Sua escolha: ");
        
        cod = scan.nextInt();
        
        if (cod == 1){
            desconto = 5;
                         
        }else{
            if (cod == 2){
                desconto = 10;
            }else{
                if (cod == 3){
                    desconto = 20;
                    
                }else{
                    if (cod == 4){
                        desconto = 50;
                    }
                }
            }
        }
        
        valorcomdesconto = num1 - ((num1 * desconto) / 100);
        System.out.println("O valor do Produto com desconto é: " + valorcomdesconto);
        
        
        
        
        
        
        
        
        
        
    }
    
}
