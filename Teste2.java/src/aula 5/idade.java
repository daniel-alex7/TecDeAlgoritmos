// O que é um interpretador em java?
// Um interpretador em Java é um programa que 
// lê e executa o código bytecode gerado pelo compilador Java.
// O bytecode é uma representação intermediária do 
// código-fonte Java, que é independente da 
// plataforma. O interpretador Java, conhecido como
// Java Virtual Machine (JVM), traduz o bytecode
// em instruções de máquina específicas do sistema
// operacional em que está sendo executado, permitindo
// que o mesmo código Java seja executado em diferentes
// plataformas sem a necessidade de recompilação.

// • Java Micro Edition (Java ME): para aplicações portáteis, isto é, aquelas que executam
// no celular do usuário.
// • Java Enterprise Edition (Java EE): para aplicações que executam em um servidor,
// isto é, respondendo requisições.
// • Java Standard Edition (Java SE): para aplicações desktop, isto é, aquelas que executam
// no computador do usuário.

// Em java clase é o nome do programa,clase é um pequeno programa que criamos para chamar novamente
// No mesmo programa Um subsistema (pacote) contém vários pequenos programas
// (classes)

// package não vai por conta do projeto já está em uma pasta


public class idade {
    public static void main(String[] args) {
        int idade = 18;
        int outraIdade = 20;
        idade = outraIdade;
        System.out.println("A idade é " + idade);
    }
}