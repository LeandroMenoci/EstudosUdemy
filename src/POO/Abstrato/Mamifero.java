package POO.Abstrato;

public abstract class Mamifero extends Animal{

    @Override
    public String mover() {
        return "usando as patas";
    }

    abstract String mamar();
}
