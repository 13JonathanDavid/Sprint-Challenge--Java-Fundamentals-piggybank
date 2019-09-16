package lambdaschool.bank;

public class Dime extends Coin{

    public Dime(int q) {
        super("Dime", 0.1, q);
    }

    public Dime() {
        super("Dime", 0.1, 1);
    }
}