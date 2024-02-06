// Problem statement
// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

// Note: You don't have to write the main function or take input. It has already been taken care of and you need to just print the integer value . Just write the code that prints Fahrenheit to Celsius table in the function itself.


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

