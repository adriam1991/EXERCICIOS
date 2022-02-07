import java.util.Random;
import java.util.Scanner;


public class CoinGameProfe {


    private static final int FACE = 1; //constante global dinamica si le pones final
    private static final int CROSS = 2;

    private static int headCounter = 0; //variable Gobal
    private static int totalThrows = 0;

    public static void main(String[] args) {

        while (askIfWantsToThrowCoin()) {

            int coinValue = throwCoin();
            calculateResult(coinValue);
            printResult();

        }
    }

    private static void printResult() {
        System.out.println("T'ha sortit " + headCounter + "vegades cara, en un total de " + totalThrows + " tirades");
    }

    private static void calculateResult(int coinValue) {
        if (coinValue == FACE) {
            System.out.println("T'ha sortit Cara!!");
            headCounter++;
        } else {
            System.out.println("T'ha sortit Creu!!");
        }

        totalThrows++;
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

