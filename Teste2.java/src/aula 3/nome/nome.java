import java.util.Scanner;

public class nome {
    public static void main(String args[ ]){
        String nome;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Olá " + nome + " seja bem vindo!");
        leitor.close();
    }
} 
    

