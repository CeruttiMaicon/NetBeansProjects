/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * FECHAR AS CHAVES DIREITO
 */
package projetojogomatematica;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Maicon, Gabriel e Jeferson
 */
public class ProjetoJogoMatematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException, IOException {
        // TODO code application logic here
        
        boolean ligado1 = true;
        boolean ligado2 = true;
        boolean ligado3 = true;
        
       
        int resp = 0;
        int resp1 = 0;
        
        
        
        
        int opcao = 0;
        int opcao2 = 0;
        Scanner scan = new Scanner(System.in);
        while(ligado1){
                
            System.out.println("             Jogo de Matemática");
            System.out.println("********************************************");
            System.out.println("1 - Novo Jogo                               *");
            System.out.println("2 - Sair                                    *");
            System.out.println("*********************************************");
            System.out.print("Sua opção é: ");
            opcao = scan.nextInt();
            
            if (opcao == 1){
                while (ligado2){
                    System.out.println("           Selecinar Dificuldade");
                    System.out.println("********************************************");
                    System.out.println(" 1 - EASY                                  *");
                    System.out.println(" 2 - HARD CORE                             *");
                    System.out.println(" 3 - Voltar                                *");
                    System.out.println("********************************************");
                    System.out.print("Sua opção é: ");
                    opcao = scan.nextInt();
                    
                    int somaponto = 0;
                    int vida = 5;
                    int rodada = 0;
                    int gameover = 0;
                    ligado3 = true;
                    
                    
                    if (opcao == 1){
                        //Abrir site da Barbie!!
                        System.out.println("Modo Easy é para os fracos");
                        System.out.println("Game Over");
                        java.awt.Desktop.getDesktop().browse( new java.net.URI( "http://www.naoentreaki.com.br/7418035-jogar-no-modo-easy-e-para-os-fracos.htm" ) );
                        ligado1 = false;
                        break;                    
                    }
                    
                    if (opcao == 3){ // Opcao de Voltar
                        break;
                    }
                    
                    if (opcao == 2){
                        while (ligado3){ // Opcao HARDCORE
                            
                            int nivel = 1;
                            System.out.println("********************************************");
                            System.out.println("Nivel " + nivel);
                            System.out.println("********************************************");
                            
                            Random aleatorio = new Random();
                            
                            for (int i = 0; i < 5; i++){ //Contas de Mais Level 1
                                
                                int num1 = aleatorio.nextInt(200);
                                int num2 = aleatorio.nextInt(200);
                                
                                
                                rodada = i +1;
                                int somareal = num1 + num2;
                                System.out.println("Total de Vidas " + vida + " Pontuação: " + somaponto);
                                System.out.println("Rodada " + rodada);
                                
                                System.out.println("Soma " + num1 + " + " + num2 + " = ");
                                System.out.print("Sua resposta: ");
                                resp1 = scan.nextInt();
                                
                                
                                //Resposta Correta Level 1
                                if (resp1 == somareal){
                                    somaponto+=10;
                                    System.out.println("Correto!");
                                    System.out.println("********************************************");
                                }else{
                                    System.out.println("Incorreto!");
                                    System.out.println("A resposta correta seria " + somareal);
                                    System.out.println("********************************************");
                                    somaponto-=5;
                                    vida--;
                                    
                                    if (vida == 0){
                                        System.out.println("                 GAME OVER");
                                        gameover = 1;
                                        
                                    }
                                    
                                }
                            }
                            
                            for (int f = 5; f < 10; f++){ // Contas de Menos Level 1
                                
                                if (gameover == 1){
                                    ligado3 = false;
                                    break;
                                }
                                
                                int num3 = aleatorio.nextInt(200);
                                int num4 = aleatorio.nextInt(200);
                                
                                int somareal1 = num3 - num4;
                                rodada = f +1;
                                
                                System.out.println("Total de Vidas " + vida + " Pontuação: " + somaponto);
                                System.out.println("Rodada " + rodada);
                                System.out.println("Subtraia " + num3 + " - " + num4 + " = ");
                                System.out.print("Sua resposta: ");
                                resp = scan.nextInt();
                                
                                if (resp == somareal1){
                                    somaponto+=10;
                                    System.out.println("Correto!");
                                    System.out.println("********************************************");
                                }else{
                                    System.out.println("Incorreto!");
                                    System.out.println("A resposta correta seria " + somareal1);
                                    System.out.println("********************************************");
                                    somaponto-=5;
                                    //vida--;
                                    
                                    if (vida == 0){
                                        System.out.println("                 GAME OVER");
                                        gameover = 1;
                                        
                                    }
                                    
                                    
 
                                }
                            }
                            int somareal = 0;
                            
                            nivel++;
                            System.out.println("********************************************");
                            System.out.println("Nivel " + nivel);
                            System.out.println("********************************************");
                            for (int a = 0; a < 10; a++){ //Nível 2
                                
                                int num5 = aleatorio.nextInt(10);
                                int num6 = aleatorio.nextInt(10);
                                
                                rodada = a +1;
                                int multireal = num5 * num6;
                                System.out.println("Total de Vidas " + vida + " Pontuação: " + somaponto);
                                System.out.println("Rodada " + rodada);
                                
                                System.out.println("Multiplica " + num5 + " * " + num6 + " = ");
                                System.out.print("Sua resposta: ");
                                resp1 = scan.nextInt();
                                
                                if (resp1 == multireal){
                                    somaponto+=10;
                                    System.out.println("Correto!");
                                    System.out.println("********************************************");
                                }else{
                                    System.out.println("Incorreto!");
                                    System.out.println("A resposta correta seria " + multireal);
                                    System.out.println("********************************************");
                                    somaponto-=5;
                                    vida--;
                                    
                                    if (vida == 0){
                                        System.out.println("                 GAME OVER");
                                        gameover = 1;
                                        
                                    }
                                    
                                }
                                
                            }
                            nivel++;
                            System.out.println("********************************************");
                            System.out.println("Nivel " + nivel);
                            System.out.println("********************************************");
                            for (int b = 0; b < 10; b++){ //Nível 3
                                
                                int num7 = aleatorio.nextInt(10);
                                int num8 = aleatorio.nextInt(10);
                                
                                if (num8 == 0){ //evitando divisões por zero
                                    num8++;
                                }
                                
                                rodada = b +1;
                                int divireal = num7 * num8;
                                System.out.println("Total de Vidas " + vida + " Pontuação: " + somaponto);
                                System.out.println("Rodada " + rodada);
                                
                                
                                System.out.println("Divida " + num7 + " / " + num8 + " = ");
                                System.out.print("Sua resposta: ");
                                float respostadivisao = scan.nextInt();
                                
                                if (respostadivisao == divireal){
                                    somaponto+=10;
                                    System.out.println("Correto!");
                                    System.out.println("********************************************");
                                }else{
                                    System.out.println("Incorreto!");
                                    System.out.println("A resposta correta seria " + respostadivisao);
                                    System.out.println("********************************************");
                                    somaponto-=5;
                                    vida--;
                                    
                                    if (vida == 0){
                                        System.out.println("                 GAME OVER");
                                        gameover = 1;
                                        
                                    }
                                    
                                }
                                
                            }
                            
                            nivel++;
                            System.out.println("********************************************");
                            System.out.println("Nivel " + nivel);
                            System.out.println("********************************************");
                            
                            for (int b = 0; b < 10; b++){ //Nível 4
                                
                                int num7 = aleatorio.nextInt(10);
                                int num8 = aleatorio.nextInt(10);
                                
                                if (num8 == 0){ //evitando divisões por zero
                                    num8++;
                                }
                                
                                rodada = b +1;
                                int divireal = num7 * num8;
                                System.out.println("Total de Vidas " + vida + " Pontuação: " + somaponto);
                                System.out.println("Rodada " + rodada);
                                
                                
                                System.out.println("Divida " + num7 + " / " + num8 + " = ");
                                System.out.print("Sua resposta: ");
                                float respostadivisao = scan.nextInt();
                                
                                if (respostadivisao == divireal){
                                    somaponto+=10;
                                    System.out.println("Correto!");
                                    System.out.println("********************************************");
                                }else{
                                    System.out.println("Incorreto!");
                                    System.out.println("A resposta correta seria " + respostadivisao);
                                    System.out.println("********************************************");
                                    somaponto-=5;
                                    vida--;
                                    
                                    if (vida == 0){
                                        System.out.println("                 GAME OVER");
                                        gameover = 1;
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
                              
                    }
                }
            }  
        }
        // Para sair do Game
        if (opcao == 2){
            ligado1 = false;
        }
    }        
}

    
    

