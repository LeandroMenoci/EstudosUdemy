package Generics;

public class CaixaTeste {
    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Ola");
        System.out.println(caixaA.abrir());

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(2.3);
        System.out.println(caixaB.abrir());
    }
}
