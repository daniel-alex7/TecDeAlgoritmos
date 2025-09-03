import java.util.Scanner;

public class ex10 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seu nome: ");
        String nome = scanner.nextLine();


        System.out.print("Sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Sua senha: ");
        int senha = scanner.nextInt();

        int senhaCorreta = 1234;

        if (senha == senhaCorreta && idade >= 18) {
            System.out.println("Acesso permitido, " + nome + "!");
        } else {
            System.out.println("Acesso negado.");
        }

    }}

