import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        int diceValue1 = new Random().nextInt(1, 7);
        int diceValue2 = new Random().nextInt(1, 7);
        System.out.println("El primer dau es: " + diceValue1);
        System.out.println("El segon dau es: " + diceValue2);

        int result = diceValue1 + diceValue2;
        System.out.println("La suma dels dos daus es: " + result);
        //System.out.println("La suma dels dos daus es: " + (diceValue1 + diceValue2));

        if (result == 7) {
            System.out.println("has guanyat");
        } else {
            System.out.println("Has perdut");
            System.out.println("Vols tornar a tirar el dau2? Escriu S o N");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            if (option.equals("S")) {
                diceValue2 = new Random().nextInt(1, 7);
                System.out.println("El segon dau es: " + diceValue2);
                result = diceValue1 + diceValue2;
                System.out.println("La suma dels dos daus es: " + (result));
                if (result == 7) {
                    System.out.println("has guanyat");
                } else {
                    System.out.println("Has perdut");
                }
            }
        }
    }
}

