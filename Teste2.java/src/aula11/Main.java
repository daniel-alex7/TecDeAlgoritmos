package aula11;

public class Main{
    public static void main(String[] args){
        Carro meuCarro = new Carro("Sedan X", "V6", 300);
        System.out.println("\n ---Ação---");
        meuCarro.dirigir();
        System.out.println("\n---Descrição---");
        meuCarro.descrever();
    }
}

class Carro{
    private Motor motor;
    private String modelo;

    public Carro(String modelo, String tipoMotor, int potenciaMotor){
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor, potenciaMotor);
        System.out.println("Carro modelo: "+ modelo + " criado");
    }
    public void descrever() {
        System.out.println("---Detalhes do Carro---");
        System.out.println("Modelo: "+ modelo);
        System.out.println("Tipo de Motor: "+ motor.getTipo());
    }
    public void dirigir(){
        System.out.println("Carro: "+ modelo + " está");
        motor.ligar();
    }
}

class Motor{
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia){
        this.tipo = tipo;
        this.potencia = potencia;
        System.out.println("Motor criado: "+ tipo+ " com " + potencia + "CV.");
    }
    public void ligar(){
        System.out.println("Motor está ligado.");
    }
    public String getTipo(){
        return tipo;
    }
}