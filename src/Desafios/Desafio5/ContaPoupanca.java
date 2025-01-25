package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    //Construtores
    public ContaPoupanca(){
    }
    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    public ContaPoupanca(String titular, double saldo, TipoConta tipo) {
        super(titular, saldo, tipo);
    }

    @Override
    public void depositar(double valor) {
        double percentual = 0.01;
        System.out.println("Será depositado R$ " + valor + " e será cobrado uma taxa de 1%.");
        valor = valor - (percentual * valor);
        saldo += valor;

        System.out.println("Novo saldo:\nR$"+saldo);
    }
}
