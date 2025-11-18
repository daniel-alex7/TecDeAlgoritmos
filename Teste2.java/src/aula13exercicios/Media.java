package aula13exercicios;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários? ");
        int qtd = sc.nextInt();

        double soma = 0;

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Salário do funcionário " + i + ": ");
            double sal = sc.nextDouble();
            soma += sal;
        }

        double media = soma / qtd;

        System.out.println("Média salarial da empresa: R$ " + media);

        sc.close();
    }
}
