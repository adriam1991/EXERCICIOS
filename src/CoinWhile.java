
//preguntem si vol tirar la moneda
//tirar la moneda
//mostrar cara o creu
//si es  cara, sumem al contador +1
//mostrar resultat

import java.util.Random;
import java.util.Scanner;

public class CoinWhile {
    private static final int FACE = 1;
    private static final int CROSS = 2;

    public static void main(String[] args) {
        int headCounter=0;
        int totalTrhows=0;

        while (askIfWantsToThrowCoin()) {

            int coinValue = throwCoin();
            if (coinValue == FACE) {
                headCounter++;

                System.out.println("T'ha sortit Cara");
            } else {
                System.out.println("T'ha sortit Creu!!");
            }
            totalTrhows++;
            System.out.println("Resultat:  Cares: "+ +headCounter +" "+ "Toltal tirades" + " " +totalTrhows);
        }

    }

    private static int throwCoin() {
        return new Random().nextInt(1, 3);

    }

    private static boolean askIfWantsToThrowCoin() {
        System.out.println("Vols tirar la moneda? (S/N)");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text.equalsIgnoreCase("S");
    }
}