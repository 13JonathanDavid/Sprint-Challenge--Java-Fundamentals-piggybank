package lambdaschool.bank;

public class Dollar extends Coin{

    public Dollar(int q) {
        super("Dollar", 1, q);
    }

    public Dollar() {
        super("Dollar", 1, 1);
    }
}