/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentodeerros;

/**
 *
 * @author Maicon
 */
public class TratamentoDeErros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 4;
        int j = 0;
        
        try{
            int x = i / j;
            throw new Exception ("O arquivo .txt não foi encontrado");
        }catch(ArithmeticException a){
            System.out.println("Divisão por zero");
        } catch(Exception e){
            System.out.println("Erro : " + e.getMessage());
        }finally{
            System.out.println("Bloco finally. Sempre executa");
        }
    }
    
}
