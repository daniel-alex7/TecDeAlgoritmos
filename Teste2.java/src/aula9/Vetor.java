package aula9;
public class Vetor {

    // O que são? Um vetor (ou array unidimensional) é uma estrutura de dados que
    // armazena uma coleção de elementos do mesmo tipo de dados sob um único nome.
    // •Alocação Contígua: Os elementos são armazenados em posições de memória
    // contíguas (uma após a outra).
    // •Índices: O acesso a cada elemento é feito por meio de um índice numérico,
    // que sempre
    // começa em 0 (zero).
    // •Exemplo: Em um vetor de 5 elementos, os índices vão de 0 a 4.

    public static void main(String[] args) {
        int[] vetor;

        //Alocação para 5 elementos
        vetor = new int[5];

        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;

        int[] vetor2 = { 1, 2, 3, 4, 5 };

        System.out.println("Elementos do vetor[0] "+ vetor[0]);
        System.out.println("Elementos do vetor2[4] "+ vetor2[4]);

        

        

    }

}
