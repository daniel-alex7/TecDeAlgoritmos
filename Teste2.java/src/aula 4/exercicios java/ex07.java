import java.util.Scanner;

public class ex07 {
    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite seu ano de nascimento: ");
    int anoN = scanner.nextInt();

    System.out.print("Digite o ano atual: ");
    int anoA = scanner.nextInt();

    int idade = anoA - anoN;

    if (idade >= 19) {
        System.out.println(nome + " Sua entrada foi permitida");
    } else {
        System.out.println("Você não pode entrar");
     }
     

     
    }

}