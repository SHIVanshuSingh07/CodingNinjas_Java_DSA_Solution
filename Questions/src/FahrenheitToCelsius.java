import java.util.Scanner;
public class FahrenheitToCelsius {
        public static void printFahrenheitToCelsiusTable(int startFahrenheit, int endFahrenheit, int stepSize) {
            System.out.println("Fahrenheit\tCelsius");
            for (int fahrenheit = startFahrenheit; fahrenheit <= endFahrenheit; fahrenheit += stepSize) {
                int celsius = (int) ((5.0 / 9.0) * (fahrenheit - 32));
                System.out.println(fahrenheit + "\t\t" + celsius);
            }
        }

        public static void main(String[] args) {
            // Example usage
            Scanner sc = new Scanner(System.in);
            int startFahrenheit = sc.nextInt();
            int endFahrenheit = sc.nextInt();
            int stepSize = sc.nextInt();

            printFahrenheitToCelsiusTable(startFahrenheit, endFahrenheit, stepSize);
        }
    }

