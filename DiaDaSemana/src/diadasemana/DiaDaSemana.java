
package diadasemana;
import java.util.Scanner;

public class DiaDaSemana {

   
    public static void main(String[] args) {
        
        int num1;
        
        System.out.println("Digite o dia da Semana em número de 1 a 7: ");
        
        Scanner lei = new Scanner(System.in);
        num1 = lei.nextInt();
        
        if (num1 ==1){
            System.out.println("Domingo");
        }
        else{
            if (num1 == 2){
                System.out.println("Segunda");
            }else{
                if (num1 == 3){
                    System.out.println("Terça");
                    
                }else{
                    if (num1 == 4){
                        System.out.println("Quarta");
                    }else{
                        if (num1 == 5){
                            System.out.println("Quinta");
                       
                        }else{
                            if (num1 == 6){
                                System.out.println("Sexta");
                                
                            }else{
                                if (num1 == 7){
                                    System.out.println("Sábado");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
                        
            
                
        
          
        
     
        
        
       

