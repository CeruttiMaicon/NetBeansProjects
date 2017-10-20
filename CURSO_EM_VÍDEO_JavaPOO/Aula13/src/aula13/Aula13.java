
package aula13;


public class Aula13 {

    
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        //com frases
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        
        //com horario
        c.reagir(11, 00);
        c.reagir(19, 45);
        
        //com booleano
        c.reagir(true);
        c.reagir(false);
        
        //com idade + peso
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
    }
    
}
