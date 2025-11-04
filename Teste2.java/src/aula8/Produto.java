package aula8;

public class Produto  {
    public int id;
    public String nome;
    public String desc;
    public String validar;
    public String checar;
    public void Produtos(int id, String nome, String desc, String validar, String checar) {
        this.id = id;
        this.nome = nome;
        this.desc = desc;
        this.validar = validar;
        this.checar = checar;
        
    }   
    public void Imprimir() {
        System.out.println("Produto ID: "+ id + " Nome: " + nome + " Descrição: " + desc);
    }

    public void MudarNome(String novoNome) {
        this.nome = novoNome;
    }
    public void MudarDesc(String novaDesc) {
        this.desc = novaDesc;
    }   
    public static void main(String[] args) {
        Produto p;
        p = new Produto();
        p.Imprimir();
        System.err.println("***** Alterando nome *****");
        p.MudarNome("Caneta");
        p.MudarNome("**** Mudar descrição ****");
        p.MudarDesc("Caneta vermelha esferográfica");
        p.Imprimir();
    }
    
}