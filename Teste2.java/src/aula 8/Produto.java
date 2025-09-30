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

    public void Validar(){
        System.out.println("Validando: " + validar);
    }

    public void Checar(){
        System.out.println("Checando: " + checar);
    }   
    public static void main(String[] args) {
        Produto p;
        p = new Produto();
        p.Produtos(1, "Camiseta |", "Camiseta Branca |", "Validar ", "Checar");
        p.Imprimir();
        p.MudarNome("Camiseta Preta | ");
        p.MudarDesc("Camiseta Preta de Algodão |");
        p.Imprimir();
        p.Validar();
        p.Checar();

        
    }
    
}