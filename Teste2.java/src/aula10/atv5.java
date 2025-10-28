package aula10;

import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int tamanho = 6;
        int[] vetorOriginal = new int[tamanho];
        int[] vetorInvertido = new int[tamanho];

        // Example for loop to fill vetorOriginal
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número para o vetor A: ");
            vetorOriginal[i] = scan.nextInt();
        }
        int j = tamanho - 1;
        for (int i = 0; i < tamanho; i++) {
            vetorInvertido[j] = vetorOriginal[i];
            j--;
        }
        // Exibição de vetores
        System.out.print("Vetor original: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorOriginal[i] + " ");
        }

        System.out.print("\nVetor invertido: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorInvertido[i] + " ");
        }

    }
}
