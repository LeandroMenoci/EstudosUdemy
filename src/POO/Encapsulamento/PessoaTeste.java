package POO.Encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 34);
        p1.setIdade(-30); // alterado a variável

        System.out.println(p1);    // ler
    }
}
