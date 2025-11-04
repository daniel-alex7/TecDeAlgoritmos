// • Na empresa onde trabalhamos, há tabelas com o valor gasto em
// cada mês. Para fechar o balanço do primeiro trimestre,
// precisamos somar o gasto total. Em janeiro foram gastos 15000
// reais; em fevereiro, 23000 reais e, em março, 17000 reais.

// • Faça um programa que imprima o gasto total no trimestre e, no
// final, avise se o gasto total estourou o orçamento de 50000 para
// o trimestre.

// a) Crie uma classe chamada BalancoTrimestral contendo um bloco main.
// b) No main, declare variáveis para cada um dos meses e inicialize-as com os valores dos gastos de cada mês. 
// c) Crie uma variável chamada gastosTrimestre e inicialize-a com a soma do valor das variáveis criadas anteriormente.
// d) Imprima o valor de gastosTrimestre
// e) Crie uma estrutura de decisão que imprima a mensagem “Estourou o orçamento!” se o valor de gastos trimestre superar 50000.

package aula5.atividades.atv3;
public class EmpresaAtiv {
    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int gastosTrimestre = janeiro + fevereiro + marco;
        System.out.println("Gasto total no trimestre: " + gastosTrimestre);

        if (gastosTrimestre > 50000) {
            System.out.println("Estourou o orçamento!");
        }
    }
}
