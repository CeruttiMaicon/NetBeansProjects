
package aula13;


public class Mamifero extends Animal {
    
    protected String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getMembros() {
        return membros;
    }

    public void setMembros(float membros) {
        this.membros = membros;
    }
    

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
    
    
}
