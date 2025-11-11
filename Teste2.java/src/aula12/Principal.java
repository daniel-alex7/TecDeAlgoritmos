class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mover() {
        System.out.println(this.nome + " está se movendo de alguma forma.");
    }

    public void emitirSom() {
        System.out.println(this.nome + " está emitindo um som genérico.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

class Cachorro extends Animal {
    private boolean lateAlto;

    public Cachorro(String nome, int idade, boolean lateAlto) {
        super(nome, idade);
        this.lateAlto = lateAlto;
    }

    @Override
    public void emitirSom() {
        if (lateAlto) {
            System.out.println(this.getNome() + " diz: AU AU AU! (E é bem barulhento!)");
        } else {
            System.out.println(this.getNome() + " diz: Woof woof.");
        }
    }

    @Override
    public void mover() {
        System.out.println(this.getNome() + " está correndo atrás da bola.");
    }
}

class Gato extends Animal {
    private final String raca;

    public Gato(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " diz: Meow! (Sou da raça " + this.raca + ")");
    }

    public void arranharMoveis() {
        System.out.println(this.getNome() + " está arranhando o sofá. Que travesso!");
    }
}

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Projeto Animais: Herança e Sobrescrita ---");

        Gato gatinho = new Gato("Miau", 2, "Siamês");
        System.out.println("\n--- Dados do Gato: " + gatinho.getNome() + " ---");
        gatinho.mover();
        gatinho.emitirSom();
        gatinho.arranharMoveis();

        System.out.println("-------------------------------------------------");

        Cachorro doguinho = new Cachorro("Rex", 5, true);
        System.out.println("\n--- Dados do Cachorro: " + doguinho.getNome() + " ---");
        doguinho.mover();
        doguinho.emitirSom();

        System.out.println("-------------------------------------------------");

        System.out.println("--- Polimorfismo ---");
        Animal a1 = new Cachorro("Bolinha", 1, false);
        Animal a2 = new Gato("Felix", 7, "Vira-Lata");

        System.out.println("\nNome do a1: " + a1.getNome());
        a1.emitirSom();

        System.out.println("\nNome do a2: " + a2.getNome());
        a2.emitirSom();
    }
}
