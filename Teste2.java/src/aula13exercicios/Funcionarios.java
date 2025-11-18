package aula13exercicios;

public class Funcionarios {
    public static void main(String[] args) {

        Gerente g = new Gerente("Ana", 8000.0, "Tecnologia");
        g.aumentarSalario(10);
        g.exibirInformacoes();

        Desenvolvedor d = new Desenvolvedor("Carlos", 5000.0, "Java");
        d.trabalhar();
        d.receberBonus(700);
        d.exibirInformacoes();

        Estagiario e = new Estagiario("Lucas", 1500.0, 20);
        e.trabalhar();
     	e.exibirInformacoes();

        RecursosHumanos rh = new RecursosHumanos("Fernanda", 6000.0);
        rh.marcarEntrevista("João");
        rh.exibirInformacoes();

        Financeiro f = new Financeiro("Roberta", 7000.0);
        f.processarPagamento(1500);
        f.exibirInformacoes();
    }
}


class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Salário: R$" + salario);
    }

    /**
     * Ajusta o salário do funcionário.
     * @param novoSalario 
     */
    public void ajustarSalario(double novoSalario) {
        this.salario = novoSalario;
    }

    /**
     * Retorna o salário atual.
     */
    public double getSalario() {
        return this.salario;
    }
}


class Gerente extends Funcionario {

    private final String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public void aprovarProjeto(String projeto) {
        System.out.println(nome + " aprovou o projeto: " + projeto);
    }

   
    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Gerente: " + nome + 
                           " | Salário: R$" + salario + 
                           " | Setor: " + setor);
    }
}


class Desenvolvedor extends Funcionario {

    private final String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public void trabalhar() {
        System.out.println(nome + " está programando em " + linguagem + "...");
    }

    public void receberBonus(double bonus) {
        salario += bonus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Desenvolvedor: " + nome + 
                           " | Linguagem: " + linguagem + 
                           " | Salário: R$" + salario);
    }
}

class Estagiario extends Funcionario {

    private final int horasSemana;

    public Estagiario(String nome, double salario, int horasSemana) {
        super(nome, salario);
        this.horasSemana = horasSemana;
    }

    public void trabalhar() {
        System.out.println(nome + " está ajudando nas tarefas (" + horasSemana + "h/semana).");
    }

    public void receberValeTransporte() {
        System.out.println(nome + " recebeu vale-transporte.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Estagiário: " + nome + 
                           " | Horas semanais: " + horasSemana + 
                           " | Salário: R$" + salario);
    }
}

class RecursosHumanos extends Funcionario {

    public RecursosHumanos(String nome, double salario) {
        super(nome, salario);
    }

    public void marcarEntrevista(String candidato) {
        System.out.println("Entrevista marcada com o candidato: " + candidato);
    }

    public void registrarContratacao(String nome) {
        System.out.println("Funcionário contratado: " + nome);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Funcionário de RH: " + nome + " | Salário: R$" + salario);
    }
}


class Financeiro extends Funcionario {

    public Financeiro(String nome, double salario) {
        super(nome, salario);
    }

    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com sucesso.");
    }

 
    public void emitirNotaFiscal(String descricao) {
        System.out.println("Nota fiscal emitida: " + descricao);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Setor Financeiro: " + nome + " | Salário: R$" + salario);
    }
}

