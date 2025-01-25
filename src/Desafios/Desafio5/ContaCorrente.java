package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{

    //Construtores

    public ContaCorrente() {
    }
    public ContaCorrente(double saldo) {
        super(saldo);
    }
    public ContaCorrente(String titular, double saldo, TipoConta tipo) {
        super(titular, saldo, tipo);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public void depositar(double valor) {
        System.out.println("\nSeu saldo anterior é de R$ " + valor);
        saldo += valor;
        System.out.println("Será depositado um valor de R$ " + valor);
        System.out.println("Seu novo saldo é de R$ " + saldo);
    }
}
