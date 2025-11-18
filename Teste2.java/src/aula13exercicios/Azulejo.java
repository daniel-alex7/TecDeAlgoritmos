package aula13exercicios;

import java.util.Scanner;

public class Azulejo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Altura da parede (hp): ");
        double hp = sc.nextDouble();

        System.out.print("Largura da parede (lp): ");
        double lp = sc.nextDouble();

        System.out.print("Altura do azulejo (ha): ");
        double ha = sc.nextDouble();

        System.out.print("Largura do azulejo (la): ");
        double la = sc.nextDouble();

        double areaParede = hp * lp;
        double areaAzulejo = ha * la;

        double quantidade = areaParede / areaAzulejo;

        System.out.println("Quantidade necessária de azulejos: " + Math.ceil(quantidade));

   
    }
}
