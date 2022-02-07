import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        String word = askForWord();
        String revertedName = revertName(word);
        printIsPalindromo(revertedName, word);

    }

    private static void printIsPalindromo(String name, String word) {
        if (name.equals(word)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

    }

    private static String revertName(String word) {
        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;


    }

    private static String askForWord() {
        System.out.println("Introdueix la paraula i et diré si es Palindromo o no");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }
}
