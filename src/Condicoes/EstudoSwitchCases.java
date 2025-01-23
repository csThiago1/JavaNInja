package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        * Switch Cases: Servem para gerar casos especificos
        * Objetivo: Pedir pro usuario escolher entre os ninjas
        * */

        // Pedir para o usuario
        Scanner caixaDeDados = new Scanner(System.in);

        System.out.println("Escolha um ninja: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        System.out.println("4 - Kakashi Hatake");

        // Pedir para o usuario escolher uma acao
        int escolha = caixaDeDados.nextInt();

        System.out.println("Você escolheu: " + escolha);

        // Reacao ao escolher um personagem

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu Sakura Haruno");
                break;
            case 4:
                System.out.println("Você escolheu Kakashi Hatake");
                break;
            default:
                System.out.println("Você não escolheu uma opção válida");
        }

        // Fechar a caixa
        caixaDeDados.close();
    }
}
