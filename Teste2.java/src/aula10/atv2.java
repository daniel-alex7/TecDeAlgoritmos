package aula10;

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[10];
        int maior;
        int posicaoMaior;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = entrada.nextInt();
        }

        maior = vetor[0];
        posicaoMaior = 0;

        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i + 1;
            }
        }

        System.out.println("O elemento maior é: " + maior);
        System.out.println("Ele está na posição: " + posicaoMaior);

        entrada.close();
    }
}
