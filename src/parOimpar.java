import java.util.Scanner;

public class parOimpar {

    public static void main(String[] args) {

        int number = askForNumber();
        esParOImpar(number);

    }

    private static void esParOImpar(int number) {
        if (number % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es inpar");
        }

    }

    private static int askForNumber() {
        System.out.println("Introdueix un numero per saber si es Par o Impar");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
