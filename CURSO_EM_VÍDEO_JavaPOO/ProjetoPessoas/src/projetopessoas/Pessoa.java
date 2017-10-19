
package projetopessoas;


public class Pessoa {
    
    private String nome;
    private int Idade;
    private String sexo;
    
    public void fazerAniver(){
        this.Idade += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", Idade=" + Idade + ", sexo=" + sexo + '}';
    }
    
    
    
}
