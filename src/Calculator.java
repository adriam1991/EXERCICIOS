import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Vols Sumar o Restar?");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        if (option.equals("Sumar")) {
            calculateAddition();
        }else {
            calculateSubstraction();
        }

    }

    private static void choose() {
        System.out.println("Vols Sumar o Restar?");
        Scanner sc = new Scanner(System.in);
    }

    private static void calculateSubstraction() {
        int num1 = askForNumber();
        int num2 = askForNumber();
        int result = substracTwoNumber(num1, num2);
        printResult(result);
    }
    private static void calculateAddition() {
        int num1=askForNumber();
        int num2=askForNumber();
        int result=plusTwoNumber(num1,num2);
        printResult(result);
    }
    private static void printResult(int result) {
        System.out.println("Resultat: " + result);
    }
    private static int plusTwoNumber(int num1, int num2) {
        return num1 + num2;
    }
    private static int substracTwoNumber(int num1, int num2) {
    return num1 - num2;
    }
    private static int askForNumber() {
        System.out.println("Número a operar:");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
