/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Maicon
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        double a = 8.7;
        double b = 7.3;
        double c = -3.4;
        
        System.out.println(" Meth.ceil() arredondamento para cima");
        System.out.println("A = " + a + " Math.ceil(a) = "+Math.ceil(a));
        System.out.println("B = " + b + " Math.ceil(b) = "+Math.ceil(b));
        System.out.println("C = " + c + " Math.ceil(b) = "+Math.ceil(c));
        System.out.println(" Meth.ceil() arredondamento para baixo");
        System.out.println("A = " + a + " Math.floor(a) = "+Math.floor(a));
        System.out.println("B = " + b + " Math.floor(b) = "+Math.floor(b));
        System.out.println("C = " + c + " Math.floor(b) = "+Math.floor(c));
        System.out.println("Math.max retorna o maior valor");
        System.out.println("Math.max (" + a + ", " + b + ") = " + Math.max(a, b));
        System.out.println("Math.min retorna o menor valor");
        System.out.println("Math.min (" + a + ", " + b + ") = " + Math.min(a, b));
        System.out.println("Math.sqrt (a) Calcula a raiz quadrada");
        System.out.println("Match.srq(9) = " + Math.sqrt(9));
        System.out.println("Math.pow (base, potencia) Calcula a potencia");
        System.out.println("Math.pow(2,3)" + Math.pow(2,3));
        System.out.println("Math PI = " + Math.PI);
        System.out.println("Numero de Euler Math.E = " + Math.E);
        System.out.println("Numeros Randomicos Math.random()");
        for (int i = 0; i < 10;i++){
            // Faixa de numeros entre 0 e 100
            int r = (int) (Math.random() * 100);
            System.out.print(r+" ");
        }
        
    }
    
}
