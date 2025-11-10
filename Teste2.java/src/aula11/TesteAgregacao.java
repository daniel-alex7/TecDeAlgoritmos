package aula11;

class Funcionario{
    private String nome;
    Funcionario(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}

class Departamento {
    private String nome;
    private Funcionario funcionario;
    Departamento(String nome, Funcionario funcionario){
        this.nome = nome;
        this.funcionario = funcionario;
    }
    public void exibirInformacoes(){
        System.out.println("Deparatemnto: " + nome);
        System.out.println("Funcionario: "+ funcionario.getNome());
    }
}

public class TesteAgregacao {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Maria");
        Departamento departamento = new Departamento("RH", funcionario);
        departamento.exibirInformacoes();
    }
}