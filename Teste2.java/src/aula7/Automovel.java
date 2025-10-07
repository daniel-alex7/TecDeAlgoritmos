// Uma classe é um gabarito para a definição de objetos.
// ◦ propriedades (atributos) e
// ◦ comportamentos (métodos)

// Nome da classe: Um identificador para a classe que permite referenciá-la posteriormente (por
// exemplo, no momento da criação de um objeto).
// ◼Atributos:
// ◼nome: um identificador para o atributo.
// ◼tipo: o tipo do atributo (inteiro, real, caracter, outra classe, etc.)
// ◼valor_default: opcionalmente, pode-se especificar um valor inicial para o atributo.

//  visibilidade: opcionalmente, pode-se especificar o quão acessível é um atributo de um
// objeto a partir de outros objetos. Valores possíveis são:
// - private:nenhuma visibilidade externa
// + public:visibilidade externa total
// # protected:visibilidade externa limitada.
// ◦ Métodos:
// ◦ nome: um identificador para o método.
// ◦ tipo: quando o método tem um valor de retorno, o tipo desse valor.
// ◦ lista de argumentos: quando o método recebe parâmetros para sua execução, o tipo e um
// identificador para cada parâmetro.
// ◦ visibilidade: como para atributos, define o quão visível é um método a partir de objetos de
// outras classes.

// public void transferirProprietario (String nome) {
// this.nomeProprietario = nome;
// }
// public void mudarPlaca (String nPlaca) {
// this.placa = nPlaca;
// }

// Exemplo de Classe
package aula7;
public class Automovel {
    public String nomeProprietario;
    public String modelo;
    public String placa;
    public int ano;

    public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
        this.nomeProprietario = nomeProprietario;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void imprimir() {
        System.out.println(nomeProprietario + " possui um(a) " + modelo + " com placa " + placa + " e ano " + ano);
    }

    public void transferirProprietario(String nome) {
        this.nomeProprietario = nome;
    }

    public void mudarPlaca(String nPlaca) {
        this.placa = nPlaca;
    }

    public static void main(String args[]) {
        Automovel a;
        a = new Automovel("Eduardo", "Palio", "JWO2125", 2002);
        a.imprimir();
        System.out.println("***Transferencia de Proprietario***");
        a.transferirProprietario("Rosa");
        a.imprimir();
        a = new Automovel("Rodrigo", "Parati", "JSX6481", 1999);
        a.imprimir();
        System.out.println("***Mudanca de Placa***");
        a.mudarPlaca("SDK2581");
        a.imprimir();
    }
}
