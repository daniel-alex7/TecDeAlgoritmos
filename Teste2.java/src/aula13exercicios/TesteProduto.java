package aula13exercicios;

class Produto {

    private String nome;
    private double precoCusto;
    private double margemLucro; // percentual (ex: 20%)

    public Produto(String nome, double precoCusto, double margemLucro) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
    }

    public Produto() {
    }

    public double calcularPrecoVenda() {
        return precoCusto + (precoCusto * (margemLucro / 100));
    }

    public double aplicarDesconto(double desconto) {
        double precoVenda = calcularPrecoVenda();
        double valorDesconto = precoVenda * (desconto / 100);
        return precoVenda - valorDesconto;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço de custo: R$" + precoCusto);
        System.out.println("Margem de lucro: " + margemLucro + "%");
        System.out.println("Preço de venda: R$" + calcularPrecoVenda());
        System.out.println("------------------------------");
    }
}
public class TesteProduto {
    public static void main(String[] args) {

        Produto p1 = new Produto("Mouse Gamer", 80.0, 30);
        p1.exibirInformacoes();

        double precoComDesconto = p1.aplicarDesconto(10);
        System.out.println("Preço do Mouse com 10% de desconto: R$" + precoComDesconto);
        System.out.println();

        Produto p2 = new Produto("Teclado Mecânico", 200.0, 40);
        p2.exibirInformacoes();

        double precoComDesconto2 = p2.aplicarDesconto(15);
        System.out.println("Preço do Teclado com 15% de desconto: R$" + precoComDesconto2);
    }
}
