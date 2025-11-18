package aula9;

public class Matriz01{
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Percorrendo matriz com for aninhado:");
        // Loop for alinhado para percorrer a matriz
        for (int[] matriz1 : matriz) {
            // Loop percorre as colunas (j) da linha atual da matriz(i)
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }    
}
