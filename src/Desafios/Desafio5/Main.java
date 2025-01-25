package Desafios.Desafio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tamanhoLista = 5;
        ContaBancaria[] listaContas = new ContaBancaria[tamanhoLista];
        boolean continuar = true;

        System.out.println("\nBEM VINDO AO LEAFPAY");

        while (continuar) {
            System.out.println("\n1 - Cadastrar Conta Ninja");
            System.out.println("2 - Listar Contas");
            System.out.println("3 - Deletar Conta");
            System.out.println("4 - Fazer Transferencia");
            System.out.println("5 - Sair");
            System.out.println();

            int escolha1 = sc.nextInt();
            sc.nextLine();

            switch (escolha1) {
                case 1:
                    cadastrarConta(sc, listaContas);
                    break;
                case 2:
                    listarContas(listaContas);
                    break;
                case 3:
                    deletarContas(sc, listaContas);
                    break;
                case 4:
                    fazerTransferencia(sc, listaContas, continuar);
                    break;
                case 5:
                    System.out.println("\nSaindo do Sistema");
                    continuar = false;
                    break;
                default:
                    System.out.println("Insira uma opção válida");
            }
        }
    }
        public static void cadastrarConta(Scanner sc, ContaBancaria[] listaContas) {

            System.out.println("\nQue tipo de conta quer criar?");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupanca");

            int escolhaTipo = sc.nextInt();
            sc.nextLine();

            mostrarEspacosDisponiveis(listaContas);
            System.out.println("Escolha um espaço vazio:");
            int index = sc.nextInt();
            sc.nextLine();

            if (index < 0 || index >= listaContas.length) {
                System.out.println("Erro ao cadastrar conta");
                return;
            }

            if (listaContas[index] == null) {
                System.out.println("Espaço ocupado");
                return;
            }

            System.out.println("Qual o seu nome?");
            String titular = sc.nextLine();

            System.out.println("Quanto deseja depositar hoje?");
            double deposito = sc.nextDouble();
            sc.nextLine();

            ContaBancaria conta;
            if (escolhaTipo == 1) {
                conta = new ContaCorrente(titular, deposito, TipoConta.CORRENTE);
            } else if (escolhaTipo == 2) {
                conta = new ContaPoupanca(titular, 0, TipoConta.POUPANCA);
                conta.depositar(deposito);
            } else {
                System.out.println("Escolha invalida");
                return;
            }

            listaContas[index] = conta;
            System.out.println("Conta cadastrada com sucesso!");
        }

        public static void listarContas(ContaBancaria[] listaContas) {
        for (int i = 0; i < listaContas.length; i++) {
            if (listaContas[i] != null) {
                System.out.println(i + " - Espaço vago");
            } else {
                System.out.println(i + " - Conta: "  + listaContas[i].tipo+ ", Titular: " + listaContas[i].titular + ", Saldo: " + listaContas[i].saldo);
            }
        }
    }

    public static void deletarContas(Scanner sc, ContaBancaria[] listaContas) {
        listarContas(listaContas);
    System.out.println("Qual conta ninja deseja deletar?");
    int index = sc.nextInt();
    sc.nextLine();

    if (index < 0 || index >= listaContas.length || listaContas[index] == null) {
        System.out.println("Opção escolhida invalida");
    } else {
        listaContas[index] = null;
        System.out.println("Conta deletada com sucesso!");
    }
    }

    public static void fazerTransferencia(Scanner sc, ContaBancaria[] listaContas, boolean continuar) {
        System.out.println("Selecione o Titular: ");
        listarContas(listaContas);
        int escolhaTitular = sc.nextInt();
        sc.nextLine();

        System.out.println("Selecione o destinatário: ");
        int escolhaDestinatario = sc.nextInt();
        sc.nextLine();

        if (listaContas[escolhaTitular] == null || listaContas[escolhaDestinatario] == null) {
            System.out.println("ERROR CONTA NÂO ENCONTRADA");
            return;
        }

        System.out.println("Digite o valor desejado: ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        if (saldo > listaContas[escolhaDestinatario].saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            listaContas[escolhaTitular].saldo -= saldo;
            listaContas[escolhaDestinatario].depositar(saldo);
        }
    }

    private static void mostrarEspacosDisponiveis(ContaBancaria[] listaContas) {
        System.out.println("Vagas disponiveis: ");
        for (int i = 0; i < listaContas.length; i++) {
            if (listaContas[i] == null) {
                System.out.println(i + " - Espaço(s) disponiveis");
            }
        }
    }
}
