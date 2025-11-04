package aula10;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        final int tamanho = 8;
        int[] vetorOriginal = new int[tamanho];
        int[] vetorPares = new int[tamanho];
        int[] vetorImpares = new int[tamanho];
        int contPares = 0;
        int contImpares = 0;

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetorOriginal[i] = entrada.nextInt();

            // Separação entre pares e ímpares
            if (vetorOriginal[i] % 2 == 0) {
                vetorPares[contPares] = vetorOriginal[i];
                contPares++;
            } else {
                vetorImpares[contImpares] = vetorOriginal[i];
                contImpares++;
            }
        }

        // Exibição dos resultados
        System.out.print("\nVetor Original: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorOriginal[i] + " ");
        }

        System.out.print("\nVetor de Pares: ");
        for (int i = 0; i < contPares; i++) {
            System.out.print(vetorPares[i] + " ");
        }

        System.out.print("\nVetor de Ímpares: ");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(vetorImpares[i] + " ");
        }

        entrada.close();
    }
}
