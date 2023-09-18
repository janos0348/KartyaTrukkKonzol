package KartyaTrukkKonzolonOOP;

import java.util.Scanner;
import KartyaTrukkKonzolonOOP.Pakli;


public class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);
    static Pakli pakli = new Pakli();
    public static void main (String[] args) {
        pakli.feltolt();
        for (int i = 0; i < 3; i++) {
            pakli.kirak();
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        pakli.ezVolt();
    }
    
    private static int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }

}
