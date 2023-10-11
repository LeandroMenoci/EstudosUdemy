package POO.Heranca.Desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro civic = new Civic();
        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        Carro ferrari = new Ferrari();
        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);
    }
}
