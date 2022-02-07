import java.util.Random;
import java.util.Scanner;

public class Dicegame2 {

    public static void main(String[] args) {
        int diceValue1 = throwDice();
        int diceValue2 =  throwDice();
        if (hasWon(diceValue1,diceValue2)) {
            System.out.println("Has guanyat!");
        } else {
            System.out.println("Has perdut");
        }
    }
    private static boolean hasWon(int dice1,int dice2) {
        int result = dice1 + dice2;
        return result==7;
    }
    private static int throwDice() {
        return new Random().nextInt(1, 7);
    }
}


