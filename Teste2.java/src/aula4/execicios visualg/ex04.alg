algoritmo "Idade permitida"
var
    nome: caractere
    idade: inteiro
inicio

    escreva("Digite seu nome: ")
    leia(nome)
    escreva("Digite sua idade: ")
    leia(idade)
    se idade >= 18 entao
        escreva(nome + ", Você pode entrar.")
     senao
        escreva("Você  não pode entrar.")
    fimse

fimalgoritmo