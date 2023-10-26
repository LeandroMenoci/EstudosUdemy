package POO.Heranca.Desafio.Teste;

import POO.Heranca.Desafio.Carro;
import POO.Heranca.Desafio.Civic;
import POO.Heranca.Desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Carro civic = new Civic();
        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        Ferrari ferrari = new Ferrari(400);
        ferrari.acelerar();
//        ferrari.ligarTurbo();
//        ferrari.desligarAr();
        ferrari.ligarAr();
//        ferrari.frear();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);
    }
}
