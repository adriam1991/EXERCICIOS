import java.util.Scanner;


public class buyFruits {
    public static void main(String[] args) {
        int money = askMoney();
        int option = chooseFruit();
        int price = getPrice(option);
        purchaseFruit(price,money);

    }

    private static int getPrice(int option) {

        //if (option==1) return40;
        //if (option==2) return20;
        //if (option==3) return60;
        //return 0;

        if (option == 1) {
            return 40;

        } else if (option == 2) {
            return 20;

        } else
            return 60;

    }

    private static int purchaseFruit(int price, int money) {
        int result = 0;
        if (money > price) {

            result = money - price;
            System.out.println("Et queden " + result);
        } else {
            System.out.println("No tens prous diners");
        }
        return result;
    }

    private static int chooseFruit() {

        System.out.println("Escull el numero d'una de les seguents fruites: platan(1) val 40 cent,Poma(2) 20cent, Taronja(3) 60cent");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }

    private static int askMoney() {

        int money = 0;
        System.out.println("Quants diners tens?");
        Scanner sc = new Scanner(System.in);
        return money = sc.nextInt();


    }
}
