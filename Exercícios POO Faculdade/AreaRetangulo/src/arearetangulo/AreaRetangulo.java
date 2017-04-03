
package arearetangulo;
import java.util.Scanner;


public class AreaRetangulo {

    
    public static void main(String[] args) {
        
        int num1; 
        int num2;
        int resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de área de Retangulo");
        
        System.out.print("Informe o tamanho no lado A: ");
        num1 = sc.nextInt();
        
        System.out.print("Informe o tamanho do lado B: ");
        num2 = sc.nextInt();
        
        resultado = num1 * num2;
                
        System.out.println("A area do Retangulo é " + resultado);
       
       
        
    }
}
