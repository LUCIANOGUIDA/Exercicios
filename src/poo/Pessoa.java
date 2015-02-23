package poo;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public Pessoa(){
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void Fala(){
    
        System.out.println("Oi tudo Bem");
    
    }
    @Override
     public String toString() {
        return  "****************************\n"+
                "* Nome:"+getNome()       
             +"\n* Idade:"+getIdade()
             +"\n* Sexo:"+getSexo()
             +"\n*****************************\n"; 
    }
    
    
}