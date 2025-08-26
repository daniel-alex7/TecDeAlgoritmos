
import javax.swing.JOptionPane;

public class soma {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));;
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));;
        int soma = numero1 + numero2; // O operador + soma os valores

        JOptionPane.showMessageDialog(null, "A soma é, " + soma);
    }
    
    }


