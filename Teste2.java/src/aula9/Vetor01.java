package aula9;

public class Vetor01 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50};
        
        System.out.println("Percorrendo vetor com for");
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
