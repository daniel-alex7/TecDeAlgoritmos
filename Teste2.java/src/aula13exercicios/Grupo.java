package aula13exercicios;

import java.util.Scanner;

public class Grupo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double maiorAltura = 0;
        double menorAltura = 9999;
        double somaAlturaHomens = 0;
        int qtdHomens = 0;
        int qtdMulheres = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Altura da pessoa " + i + ": ");
            double altura = sc.nextDouble();

            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            if (altura > maiorAltura) maiorAltura = altura;
            if (altura < menorAltura) menorAltura = altura;

            if (sexo == 'M') {
                somaAlturaHomens += altura;
                qtdHomens++;
            } else if (sexo == 'F') {
                qtdMulheres++;
            }
            System.out.println("------------------------");
        }

        double mediaAlturaHomens = qtdHomens > 0 ? somaAlturaHomens / qtdHomens : 0;

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens);
        System.out.println("Número de mulheres: " + qtdMulheres);

    }
}
