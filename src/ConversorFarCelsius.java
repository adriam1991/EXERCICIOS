import java.util.Scanner;

public class ConversorFarCelsius {

    public static void main(String[] args) {


        double farenheitTemperature = askForTemperature();
        double celsiusTemperature = convertTemperature(farenheitTemperature);
        System.out.println("la temperatura en Celsius es " + celsiusTemperature);
    }

    private static double convertTemperature(double availableTemperature) {
        return (availableTemperature - 32) * 5 / 9;

    }

    private static double askForTemperature() {
        System.out.println("Introdueix la temperatura en Farenheit");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();

    }

}
