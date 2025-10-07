algoritmo "Emprestimo"

var

salario, prestacao: real

inicio
escreva("Digite o salário do funcionário: ")
leia(salario)
escreva("Digite o valor da prestação do empréstimo: ")
leia(prestacao / 100)

se prestacao > 0.2 * salario entao
    escreva("Empréstimo não concedido.")
senao
    escreva("Empréstimo concedido.")
fimse

fimalgoritmo