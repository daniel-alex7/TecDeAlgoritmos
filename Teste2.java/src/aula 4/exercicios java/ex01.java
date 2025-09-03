import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um número: ");
     int n1 = scanner.nextInt();
     
     System.out.print("Digite outro número: ");
     int n2 = scanner.nextInt();

     int multiplicacao = n1 * n2;
     System.out.println("A multiplicação de " + n1 + " e " + n2 + " é: " + multiplicacao);
     scanner.close();

        
        
    }
}
