/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        saldo = 0;
        status = false;
    }

    
    
    // Geters e Seters Default - START
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    // Geters e Seters Default - END
    
    public void abrirConta(String tipoConta){
        this.setTipo(tipoConta);
        this.setStatus(true);
        double acrescimoBonus;
        if (tipoConta == "cc"){
            acrescimoBonus = 50;
            this.setSaldo(this.getSaldo() + acrescimoBonus);
        }else if (tipoConta == "cp"){
            acrescimoBonus = 150;
            this.setSaldo(this.getSaldo() + acrescimoBonus);
        }
        System.out.println("Conta Aberta com sucesso!"); 
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta ainda não pode ser fechada por que ainda tem dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta ainda não pode ser fechada por que possui dividas");
        }else if (this.getSaldo() == 0){
            status = false;
            System.out.println("Conta fechada com sucesso!");
        }
        
        System.out.println("Conta Fechada");
    }
    
    public double depositar(double deposito){
        
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Depositado R$ " + deposito + " em "+ this.getTipo() + ": " + this.getNumConta());
        }else{
            System.out.println("Impossível depositar em uma conta fechada");
        }
        return saldo;
    }
    
    public void sacar(double valorSaque){
        
        if (this.getStatus() == true)
            if (this.getSaldo() >= valorSaque){
                this.setSaldo(this.getSaldo() - valorSaque);
                System.out.println("Saque realizado no valor de R$ " + valorSaque + " na conta: " + this.getNumConta() );
                }else{
                System.out.println("Saldo Insuficiente");
            }
        else{
            System.out.println("Impossível sacar de uma conta fechada");
        }        
    }
    
    public void pagarMensal(){
        
        if (this.getStatus() == true){
            double mensalidade;
            if (this.getStatus() == true && this.getTipo() == "cc" ){
                mensalidade = 12;
                this.setSaldo(this.getSaldo() - mensalidade);
                System.out.println("Mensalidade paga com sucesso!");            
            }
            if (this.getStatus() == true && this.getTipo() == "cp"){
                mensalidade = 20;
                this.setSaldo(this.getSaldo()- mensalidade);
                System.out.println("Mensalidade paga com sucesso!");
            }
        }else{
            System.out.println("Impossivel pagar mensalidade em conta fechada");
        }
    }
    
    public void estadoAtualConta(){
        System.out.println("---------------------------------------------------");
        System.out.println("Conta " + this.getTipo() + " : " + this.getNumConta());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo: R$ " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
        
    }
    
}
