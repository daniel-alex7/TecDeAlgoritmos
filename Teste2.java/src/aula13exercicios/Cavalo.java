package aula13exercicios;

import java.util.Scanner;

public class Cavalo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Massa (m) em kg: ");
        double m = sc.nextDouble();

        System.out.print("Altura (h) em metros: ");
        double h = sc.nextDouble();

        System.out.print("Tempo (t) em segundos: ");
        double t = sc.nextDouble();

        double cavalos = (m * h / t) / 745.6999;

        System.out.println("Quantidade de cavalos necessários: " + cavalos);

        
    }
}

