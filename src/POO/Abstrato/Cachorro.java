package POO.Abstrato;

public class Cachorro extends Mamifero{

    @Override
    public String mover() {
        return "usando as patas";
    }

    @Override
    String mamar() {
        return "usando leite";
    }
}
