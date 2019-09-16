package lambdaschool.bank;

public class Quarter extends Coin{

    public Quarter(int q) {
        super("Quarter", 0.25, q);
    }

    public Quarter() {
        super("Quarter", 0.25, 1);
    }
}
