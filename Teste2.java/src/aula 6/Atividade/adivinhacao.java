package Atividade;

import java.util.Random;
import java.util.Scanner;

public class adivinhacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random gerador = new Random();
        int numeroInteiro = gerador.nextInt(10);

        
        int x;
        for (x = 1; x < 10; x = x + 1) {
            System.out.print("Tente acertar o número: ");
            int valor = scan.nextInt();

            if (valor == numeroInteiro) {
                System.out.println("VOCÊ ACERTOUUU, na "+ x +" tentativa o valor era: " + numeroInteiro);
                break;
            } else {
                System.out.println("Você errou na "+ x +" tentativa,valor era: " + numeroInteiro);
            }
        }
    }

}
