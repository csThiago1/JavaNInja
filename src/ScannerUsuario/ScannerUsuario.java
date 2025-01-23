package ScannerUsuario;

import java.util.Scanner;

public class ScannerUsuario {
    public static void main(String[] args) {

        /*
        * Scanner é um jeito de trazer o usuário para dentro da aplicação
        * Objetivo: O usuário vai criar um ninja e a aplicação irá
        * validar os dados inseridos
        * */

        // Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("Ninja: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.println("Digite a idade do ninja: ");
        int idade = caixaDeTexto.nextInt();
        System.out.println("Idade: " + idade + " anos");

        // Tratamento de dados
        if (idade >= 18) {
            System.out.println("Esse ninja já pode participar de missões fora de Konoha");
        } else {
            System.out.println("Esse ninja precisa treinar mais antes de sair de Konoha");
        }

        // Fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
