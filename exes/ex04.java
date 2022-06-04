package exes;
import aula04.Bank;
public class ex04 {
    public static void main(String[] args) {
        Bank c1 = new Bank(42521, "AC", "Jão", 521, true);
        c1.info();
        c1.addCash(150);
        System.out.println(c1.getCash());
        c1.closeAcc();
        c1.exitCash(50);
        c1.payMonh();
        System.out.println(c1.getCash());
    }
}
