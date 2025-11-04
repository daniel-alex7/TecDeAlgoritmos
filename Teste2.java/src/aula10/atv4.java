package aula10;

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int tamanho = 4;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];

        int produtoEscalar = 0;

        for (int i = 0; i < tamanho; i++){
            System.out.print("Digite o " + (i + 1) + "º número para o vetor A: ");
            vetorA[i] = scan.nextInt();
            System.out.print("Digite o " + (i + 1) + "º número para o vetor B: ");
            vetorB[i] = scan.nextInt();
        }
        
        for(int i = 0; i < tamanho; i++){
            produtoEscalar = produtoEscalar +(vetorA[i] * vetorB[i]);
        }
        System.out.println("O produto escalar entre os vetores é: " + produtoEscalar);
        scan.close();

    }
}
