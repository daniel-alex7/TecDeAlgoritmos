package aula13exercicios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float celsius, K, F, Re, Ra;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = scan.nextFloat();

        K = celsius + 273.15f;
        F = (celsius * 1.8f) + 32;
        Re = celsius * 0.8f;
        Ra = (celsius * 1.8f) + 32 + 459.67f;

        System.out.println("Temperatura digitada: " + celsius + "°C");
        System.out.println("Kelvin: " + K + " K");
        System.out.println("Fahrenheit: " + F + " °F");
        System.out.println("Réaumur: " + Re + " °Re");
        System.out.println("Rankine: " + Ra + " °Ra");
    }
}