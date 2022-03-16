import java.util.Scanner;

public class exercice8 {

    private static final int START_MONEY = 1000;

    public static void main(String[] args) {

        String option = askIfWantsRetireOrIngres();
        int money = askForMoney(option);
        int result = finalMoney(option, money);
        printResult(result);
    }

    private static void printResult(int result) {
        int maxim = START_MONEY * 2;
        if (result <= maxim && result > 0)
            System.out.println("Ara tens " + result + "€");
        else
            System.out.println("No pots introduir el doble del que tens o retirar més del que tens");
    }

    private static int finalMoney(String option, int money) {
        if (option.equalsIgnoreCase("R")) {
            int result = START_MONEY - money;
            return result;
        } else if (option.equalsIgnoreCase("I")) ;
        {
            int result = money + START_MONEY;
            return result;
        }
    }

    private static int askForMoney(String option) {
        if (option.equalsIgnoreCase("R")) {
            System.out.println("Introdueix els diners a retirar ");
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        } else {
            System.out.println("Introdueix els diners a ingresar ");
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        }
    }

    private static String askIfWantsRetireOrIngres() {
        System.out.println("Vols retirar o ingresar diners? (R/I)");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text;
    }
}
