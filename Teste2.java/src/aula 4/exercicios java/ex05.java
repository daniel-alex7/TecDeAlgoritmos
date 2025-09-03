import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu salário: ");
    float salario = scanner.nextFloat();

    System.out.print("A prestação: ");
    int prestacao = scanner.nextInt();

    if (prestacao > (salario * 0.2)) {
        System.out.println("Empréstimo não concedido");
    } else {
        System.out.println("Empréstimo concedido");
    }
    
     
    }


    
}
