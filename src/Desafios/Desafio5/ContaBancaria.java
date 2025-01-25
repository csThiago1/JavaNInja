package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta{

    String titular;
    double saldo;
    TipoConta tipo;

    //Construtores
    public ContaBancaria(){

    }
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }
    public ContaBancaria(String titular, double saldo, TipoConta tipo) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo:\nR$" + saldo);
    }

    public abstract void depositar(double valor);
}
