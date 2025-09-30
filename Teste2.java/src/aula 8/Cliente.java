import java.util.Scanner;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;

    // Construtor
    public Cliente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    // Método para preencher dados via Scanner
    public void preencherDados() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        this.nome = scan.nextLine();

        System.out.print("Digite seu CPF: "); 
        this.cpf = scan.nextLine();

        System.out.println("Cliente cadastrado com sucesso!");
    }

    // Alterar nome
    public void mudarNome(String novoNome) {
        this.nome = novoNome;
    }

    // Mostrar dados
    public void mostrarDados() {
        System.out.println("Cliente ID: " + id + " Nome: " + nome + " CPF: " + cpf);
    }

    public static void main(String[] args) {
        // Criando cliente manualmente
        Cliente c1 = new Cliente(1, "João", "12345678900");
        c1.mostrarDados();

        // Criando cliente via Scanner
        Cliente c2 = new Cliente(2, "", "");
        c2.preencherDados();
        c2.mostrarDados();

        // Editando cliente
        c2.mudarNome("Maria Silva");
        c2.mostrarDados();
    }
}
