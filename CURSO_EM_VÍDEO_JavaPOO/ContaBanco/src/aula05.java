/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class aula05 {

   public static void main(String args[]){
       
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1111);
       
       p1.setDono("Jubileu da Silva");
       p1.abrirConta("cc");
       
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(2222);
       p2.setDono("Creusa Aparecida");
       p2.abrirConta("cp");
       
       p1.depositar(100);
       p2.depositar(500);
       p2.sacar(100);
       
       p1.estadoAtualConta();
       p2.estadoAtualConta();
       
       
       
       
       
       
   }

    
}
