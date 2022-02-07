import java.util.Scanner;

public class buyFruitsProfe {
    private static final int BANANA = 1;
    private static final int APPLE = 2;
    private static final int ORANGE = 3;
    private static final int BANANA_PRICE = 40;
    private static final int APPLE_PRICE = 70;
    private static final int ORANGE_PRICE = 90;

    public static void main(String[] args) {
        int availableCash = askForAvailableCash();
        int option = askForFruitOption();
        int price = getFruitPrice(option);
        purchaseFruit(availableCash, price);
    }

    private static void purchaseFruit(int availableCash, int price) {
        if (availableCash - price >= 0) {
            System.out.println("Ho has comprat");
            System.out.println("Et queden: " + (availableCash - price));
        } else {
            System.out.println("No puc comprar-ho");
        }
    }

    private static int getFruitPrice(int option) {
        if (option == BANANA) return BANANA_PRICE;
        if (option == ORANGE) return ORANGE_PRICE;
        if (option == APPLE) return APPLE_PRICE;
        return 0;
    }

    private static int askForFruitOption() {
        System.out.println("FRUITA DISPONIBLE: ");
        System.out.println("1. PLATAN: " + BANANA_PRICE);
        System.out.println("2. TARONJA: " + ORANGE_PRICE);
        System.out.println("3. POMA: " + APPLE_PRICE);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int askForAvailableCash() {
        System.out.println("Quants diners tens?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}

