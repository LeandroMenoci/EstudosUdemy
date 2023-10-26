package POO.Encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(String nome, int idade) {
        setIdade(idade); // chamando o método para não passar qualquer valor em idade
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter
    public int getIdade() {
        return idade;
    }

    // Setter
    public void setIdade(int novaIdade)  {
        novaIdade = Math.abs(novaIdade); //  transformando em valor absoluto, caso passe algum número negativo
        if(novaIdade  >= 0 &&  novaIdade <= 100) {
        this.idade  = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Olá, eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
    }
}