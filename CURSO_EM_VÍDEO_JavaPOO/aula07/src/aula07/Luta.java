
package aula07;

import java.util.Random;


public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        
        if ((l1 != l2) && l1.getCategoria().equals(l2.getCategoria())){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
        
    }
    public void lutar(){
        
        if(this.aprovada){
            System.out.println("####DESAFIADO####");
            this.desafiado.apresentar();
            System.out.println("####DESAFIANTE####");
            this.desafiante.apresentar();
            System.out.println("=============RESULTADO LUTA==============");
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("EMPATOU!!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("O lutador "+ this.desafiado.getNome() +" que foi desafiado ganhou a luta");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("O lutador "+ this.desafiante.getNome() +" que foi desafiante esafiado ganhou a luta");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("--------------------------------------");
            
        }else{
            System.out.println("A luta não ode acontecer!");
        }
        
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
