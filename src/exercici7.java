import java.util.Scanner;

public class exercici7 {

    public static void main(String[] args) {

        int age = askForAge();
        group(age);

    }

    private static void group(int age) {
        if (age < 15) {
            System.out.println("Estas al grup A");
        } else {
            System.out.println("Estas al grup B");
        }
    }

    private static int askForAge() {
        System.out.println("Introdueix la teva edat");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
