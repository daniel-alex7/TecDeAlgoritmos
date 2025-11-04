package aula4;
import java.util.Scanner;

public class votacao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();  
            if (idade < 16) {
                System.out.println("Voto negado");
            } else if (idade >= 16 && idade < 18 || idade > 70) {
                System.out.println("Voto opcional");
            } else {
                System.out.println("Voto obrigatório");
            }
        }

    } 
}
