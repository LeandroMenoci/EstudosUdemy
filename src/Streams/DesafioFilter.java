package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Carro m1 = new Carro("Prisma", 78);
        Carro m2 = new Carro("Astra", 140);
        Carro m3 = new Carro("Golf", 128);
        Carro m4 = new Carro("Gol", 114);
        Carro m5 = new Carro("Fusion", 240);
        Carro m6 = new Carro("Jetta", 200);

        List<Carro> carros = Arrays.asList(m1, m2, m3, m4, m5, m6);

        Predicate<Carro> cavalaria = a -> a.cavalos >= 130;
        Function<Carro, String> rapido = a -> "O carro " + a.modelo + " tem uma alta cavalaria com " + a.cavalos + "cv";

        carros.stream()
                .filter(cavalaria)
                .map(rapido)
                .forEach(System.out::println);
    }
}
