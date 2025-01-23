package Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        /*
        * Crie um programa que represente três ninjas da vila da Folha
        * e suas respectivas missões
        * Cada ninja tem um nome, uma idade e uma missão atribuida
        * com o nome da missão, nivel de dificuldade e status de conclusão
        * */

        //Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Encontrar os espiões";
        char nivelDaMissao = 'C';
        String  statusMissao = "Concluída";

        //Verificar nivel da missao e idade do ninja
        if (idade < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D') {
                statusMissao = "Concluida";
            } else {
                statusMissao = "Não concluida";
            }
        } else {
            statusMissao = "Concluida";
        }

        System.out.println("\nNinja: " + nomeNinja1);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel da missão: " + nivelDaMissao);
        System.out.println("Status: " + statusMissao);

        //Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 16;
        String missao2 = "Capturar os fugitivos";
        char nivelDaMissao2 = 'B';
        String  statusMissao2 = "Em andamento";

        if (idade2 < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao2 == 'D') {
                statusMissao2 = "Concluida";
            } else {
                statusMissao2 = "Não concluida";
            }
        } else {
            statusMissao2 = "Concluida";
        }

        System.out.println("\nNinja: " + nomeNinja2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Nivel da missão: " + nivelDaMissao2);
        System.out.println("Status: " + statusMissao2);
        //Ninja 3

        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 16;
        String missao3 = "Ajudar os feridos do ataque";
        char nivelDaMissao3 = 'A';
        String  statusMissao3 = "Em andamento";

        if (idade3 < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao2 == 'D') {
                statusMissao3 = "Concluida";
            } else {
                statusMissao3 = "Não concluida";
            }
        } else {
            statusMissao3 = "Concluida";
        }

        System.out.println("\nNinja: " + nomeNinja3);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao3);
        System.out.println("Nivel da missao: " + nivelDaMissao3);
        System.out.println("Status: " + statusMissao3);

    }
}
