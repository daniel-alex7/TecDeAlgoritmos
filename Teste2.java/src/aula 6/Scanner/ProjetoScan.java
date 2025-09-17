package Scanner;

import java.util.Scanner;

public class ProjetoScan {
    public static void main(String[] args) {

        int valor;
        Scanner teclado;

        // lendo valores
        teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        valor = teclado.nextInt();

        System.out.println("Valor lido: " + valor);

    }

}
