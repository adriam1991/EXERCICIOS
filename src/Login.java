import java.util.Scanner;

public class Login {

    private static final String EMAIL = "admin@tecnocampus.com";
    private static final String PASSWORD = "Tecnocampus2022";

    public static void main(String[] args) {


        String email = askForEMAIL();
        String password = askForPassword();
        printResult(email, password);

    }

    private static void printResult(String email, String passsword) {
        if (email.equals(EMAIL) && passsword.equals(PASSWORD)) {

            System.out.println("Login Correcte");
        }
        else{
            System.out.println("Login Incorrecte");
        }

    }

    private static String askForPassword() {
        System.out.println("Introdueix el password");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    private static String askForEMAIL() {
        System.out.println("Introdueix el email");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
