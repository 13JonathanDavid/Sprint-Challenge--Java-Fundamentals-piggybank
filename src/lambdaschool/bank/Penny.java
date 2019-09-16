package lambdaschool.bank;

public class Penny extends Coin{

    public Penny(int q) {
        super("Penny", 0.01, q);
    }

    public Penny() {
        super("Penny", 0.01, 1);
    }
}