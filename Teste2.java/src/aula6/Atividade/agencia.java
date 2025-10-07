package aula6.Atividade;

import java.util.Scanner;

public abstract class agencia {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // saldo(double), deposito(double), versaldo(double)
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tipo de serviço que deseja: ");
        System.out.print("[S]aldo [D]eposito [V]er Saldo: ");
        String servico = scan.next();

        double saldo = 100;
    
            switch (servico) {
            case "S":
                System.out.print("Seu saldo é " + saldo);
                break; 
                
            
            case "D":
                System.out.print("Digite o valor do deposito: ");
                double deposito = scan.nextDouble();

                double saldo_atual = saldo + deposito;
                System.out.println("Saldo atual de sua conta: " + saldo_atual);
                break;
            case "V":
                System.out.print("Seu saldo é " + saldo);
                break;

            default:
                System.out.println("Serviço não identificado");
                break;
            }
        
        
    }
}
