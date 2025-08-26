import javax.swing.JOptionPane;

public class exemplo01 {
    public static void main(String args[ ]){
        String nome;
        JOptionPane.showMessageDialog(null, "Bem vindo ao mundo da programação!");
        nome = JOptionPane.showInputDialog("Digite um número: ");
        JOptionPane.showMessageDialog(null, "Você digitou " + nome);
    }
}
