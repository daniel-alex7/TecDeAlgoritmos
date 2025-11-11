// Herança em Java é um dos pilares da Programação Orientada a
// Objetos (POO) e desempenha um papel crucial no design de
// software, facilitando a reutilização de código e a hierarquia de
// classes.

class Animal_um {
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro_um extends Animal_um {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

public class TesteSobrescrita {
    public static void main(String[] args) {
        Animal_um meuAnimal = new Animal_um();
        Animal_um meuCachorro = new Cachorro_um(); // Polimorfismo

        meuAnimal.fazerSom();     // Método da classe Animal
        meuCachorro.fazerSom();   // Método da classe Cachorro
    }
}


// O polimorfismo em Java é essencial para a flexibilidade e escalabilidade do
// código.
// Enquanto a sobrecarga permite a reutilização de métodos com diferentes
// parâmetros, a
// sobrescrita permite que subclasses forneçam implementações específicas para
// métodos
// herdados.
// Esse recurso torna o código mais adaptável e promove uma estrutura de classes
// mais organizada e eficiente.