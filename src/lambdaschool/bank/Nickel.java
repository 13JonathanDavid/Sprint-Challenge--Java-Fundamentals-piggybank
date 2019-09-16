package lambdaschool.bank;

public class Nickel extends Coin{

    public Nickel(int q) {
        super("Nickel", 0.05, q);
    }

    public Nickel() {
        super("Nickel", 0.05, 1);
    }
}