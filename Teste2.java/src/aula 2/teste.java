package aula2;

import javax.swing.JOptionPane;

public class teste {
    public static void main(String args[ ]){
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Boa noite " + nome);
    }
}
