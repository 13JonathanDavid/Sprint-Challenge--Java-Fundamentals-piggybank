package lambdaschool.bank;
import java.text.DecimalFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        double total = 0;
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        ArrayList<Coin> piggyBank = new ArrayList<Coin>();
        
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));


        for (Coin i : piggyBank) {
            System.out.println(i.toString());
            total += i.getTotal();
        }
        System.out.println();
        System.out.println("My piggybank has: " + fp.format(total));
    }
}
