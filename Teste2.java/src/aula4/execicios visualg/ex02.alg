algoritmo "Tabuada Completa"

var
    i, j, resultado: inteiro

inicio
    para i de 1 ate 10 faca
        escreval("Tabuada do ", i, ":")
        para j de 1 ate 10 faca
            resultado <- i * j
            escreval(i, " x ", j, " = ", resultado)
        fimpara
        escreval("") 
    fimpara

fimalgoritmo