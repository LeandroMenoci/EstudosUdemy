package Lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        /*
        1. A partir do produto calcular o preco real (com desconto)
        2. Imposto municipal: >= 2500 (8.5%) / < 2500 (isento)
        3. Frete: >= 3000 (100) / < 3000 (50)
        4. Arredondar: Deixar duas casas decimais
        5. Formatar: R$ 1234,56
         */

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal =
                valor -> valor >= 2500 ? valor * 1.085 : valor;
        UnaryOperator<Double> frete =
                valor -> valor >= 3000 ? valor + 100 : valor + 50;
        UnaryOperator<Double> arredondar =
                valor -> Double.parseDouble(String.format("%.2f", valor).replace(",", "."));
        Function<Double, String> formatar =
                valor -> ("R$ " + valor).replace(".", ",");

        Produto p = new Produto("iPad", 3235.89, 0.50);

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final é " + preco);
    }
}
