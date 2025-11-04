package aula6.Atividade;

import java.util.Random;
import java.util.Scanner;

public class adivinhe2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random gerador = new Random();
        int numeroInteiro = gerador.nextInt(10);

        
        int x;
        for (x = 1; x < 4; x = x + 1) {
            
            System.out.print("Tente acertar o número, você tem 3 tentativas: ");
            int valor = scan.nextInt();

            if (valor == numeroInteiro) {
                System.out.println("VOCÊ ACERTOUUU ");
                break;
            } else {
                System.out.println("Você errou ");
            }
        }
    }
    
}
