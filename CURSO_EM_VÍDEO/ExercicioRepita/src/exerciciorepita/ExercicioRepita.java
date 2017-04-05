/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Maicon
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // para exibir mensagens
        JOptionPane.showMessageDialog(null, "Programa de Numeração", "Bem Vindo!", JOptionPane.ERROR_MESSAGE);
        int num;
        int s = 0;
        int par = 0;
        int impar = 0;
        int cima = 0;
        int cont = 0;
        int media = 0;
        
        //fazendo o input
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Digite um número:<br> <em> [valor zero interrompe]</em> </br> </html>", "Entrada de Dados", JOptionPane.WARNING_MESSAGE));
            //JOptionPane.showMessageDialog(null, "você digitou o valor " + num);
            s += num;
            
            
            if (num != 0){
                
                // verificar numero par
                if ( num % 2 == 0){
                par++; 
                } else {
                    impar++;  // verificar numero impar
                }

                // numeros acima de 100
                if (num >= 100){
                    cima++; 
                }
                cont++;
            }
            
             
            
            
            
        } while (num != 0);
        
        media = s / cont;
        
        JOptionPane.showMessageDialog(null,
                "<html> Resultado <br> <hr> <br> </br> </br> A somatoria é: " + s
                + "<br> Total de valores: </br>" + cont        
                + " <br> Total de pares: </br>" + par 
                + "<br> Total de Impares: </br>" + impar
                + "<br> Números acima de 100: </br>" + cima
                + "<br> Média dos valores: </br>" + media        
                
                
                + "</html>", "Resultado Final", JOptionPane.WARNING_MESSAGE);
        
        
        
        
    }
    
}
