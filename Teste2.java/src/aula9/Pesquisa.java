package aula9;

public class Pesquisa {
    public static int buscaSequencial(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Retorna o índice do elemento encontrado
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50};
        int valorProcurado = 30;
        
        int resultado = buscaSequencial(vetor, valorProcurado);
        
        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
