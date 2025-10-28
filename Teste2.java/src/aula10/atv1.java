package aula10;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[5];

        int soma = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = entrada.nextInt();
            soma += vetor[i];
        }
        System.out.println("A soma dos números é: " + soma);
    }
}