import java.util.Scanner;

public class Tributacio {

    public static void main(String[] args) {

        int age = askForAge();
        int salari = askForIngresos();
        tributacio(age, salari);
    }

    private static void tributacio(int age, int salari) {
        if (age > 16 && salari > 1000) {
            System.out.println("Has de tributar");
        } else {
            System.out.println("No has de tributar");
        }

    }

    private static int askForIngresos() {
        System.out.println("Introdueix els teus ingresos");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

    private static int askForAge() {
        System.out.println("Introdueix la teva edat");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
