import java.util.Scanner;

public class exercici9 {
    public static void main(String[] args) {

        int age = askForAge();
        printEntrada (age);
    }

    private static int askForAge() {
        System.out.println("Introdueix la teva edat");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
    private static void printEntrada(int age) {
        if(age<4){
            System.out.println("Els menors de 5 anys no paguen entrada");
        }
        else if(age>=4&&age<18){
            System.out.println("El preu de la entrada son 5€");
        }
        else{
            System.out.println("El preu de la entrada son 10€");
        }
    }
}