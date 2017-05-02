
package aula04;


public class Caneta {
    
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    /**
     * METODO CONSTRUTOR:
     *  QUE DEFINI UM MODELO PADRÃO 
     * DE CRIAÇÃO DE OBJETO
     */
    public Caneta(String m, String c, float p){
        
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        
        this.tampar();
        
    }

    
    /*
    * MODELO GET
    * FAZ A BUSCA DE INFORMAÇÃO
    * ELE PUXA UM RESULTADO
    * GET = PEGAR
    
    */
    public String getModelo(){
        return this.modelo;
    }
    
    /*
    * MODELO SET
    * ELE RECEBE UMA INFORMAÇÃO
    * 
    
    */
    public void setModelo(String m){
        this.modelo = m;
        
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
