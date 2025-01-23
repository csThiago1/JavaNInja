package Desafios;

/*System.out.println("\n===== Menu Ninja =====");
   System.out.println("1. Cadastrar Ninja");
   System.out.println("2. Listar Ninjas");
   System.out.println("3. Sair");
   System.out.print("Escolha uma opção: ");
   1- Permita ao usuário cadastrar o nome de um ninja
   2- Exiba a lista de todos os ninjas cadastrados
   3- Imprima os dados: Use sout para mostrar as informações
   4- O user pode encerrar o programa a qualquer momento*/

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        //Entrada de dados
        Scanner sc = new Scanner(System.in);

        //Fazer o array
        int NUMERO_MAX = 5;
        String[] ninjas = new String[NUMERO_MAX];

        //Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {


            //MENU INICIAL
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja: ");
                        String nomeNinja = sc.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        //Somando mais um ninja a lista
                        ninjasCadastrados++;
                        System.out.println("Ninja Cadastrada com sucesso!");
                    } else {
                        System.out.println("A lista de ninjas já está cheia!");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado!");
                    } else {
                        System.out.println("Lista de ninjas cadastrados:");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Finalizando a apliacação... Aguarde");
                    break;

                default:
                    System.out.println("Usuário não escolheu uma opção válida!");
                    break;


            }
        }
    }
}
