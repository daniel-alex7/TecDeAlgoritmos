package aula6.Condicao;
// Esse fez em aula
public class SwitchExample {
    public static void main(String[] args) {
        int x;
        x = 1;
        switch (x) {
            case 0:
                System.out.println("X é 0");
                break;
            case 1:
                System.out.println("X é 1");
                break;

            default:
                System.out.println("X tem um valor diferente de 0 e 1");
                break;
        }
    }
}