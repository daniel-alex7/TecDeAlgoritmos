// A composição é um tipo de associação mais forte, onde um objeto "parte" de outro objeto.
// Se o objeto "pai" for destruído, seus objetos "filhos" também serão destruídos.
// Em outras palavras, o ciclo de vida dos objetos componentes depende do ciclo de vida do
// objeto que os contém.

// Características da Composição:
// •Relacionamento forte: O objeto "pai" contém o objeto "filho" e controla seu ciclo de
// vida.

// •Destruição: Quando o objeto "pai" é destruído, o objeto "filho" também é destruído.

// •Exemplo: Uma casa e seus cômodos. Se a casa for destruída, os cômodos também serão
// destruídos, pois não existem independentemente.

package aula11;

class Comodo {
    private String nome;
    Comodo(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}

class Casa {
    private Comodo cozinha;
    private Comodo sala;
    private Comodo quarto;
    private Comodo quintal;
    private Comodo varanda;
    private Comodo banheiro;
    private Comodo garagem;


    Casa(){
        this.cozinha = new Comodo("Cozinha");
        this.sala = new Comodo("Sala");
        this.quarto = new Comodo("Quarto");
        this.quintal = new Comodo("Quintal");
        this.varanda = new Comodo("Varanda");
        this.banheiro = new Comodo("Banheiro");
        this.garagem = new Comodo("Garagem");
    }
    public void mostrarComodo(){
        System.out.println("Cômodos da casa: ");
        System.out.println(cozinha.getNome());
        System.out.println(sala.getNome());
        System.out.println(quarto.getNome());
        System.out.println(quintal.getNome());
        System.out.println(varanda.getNome());
        System.out.println(banheiro.getNome());
        System.out.println(garagem.getNome());
    }
}
public class TesteComposicao {
    public static void main(String[] args){
        Casa casa = new Casa();
        casa.mostrarComodo();
    }
}