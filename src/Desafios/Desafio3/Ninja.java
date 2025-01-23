package Desafios.Desafio3;

import java.sql.SQLOutput;

public class Ninja {
    String nome;
    String dificuldade;
    String status;
    String missao;
    int idade;

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade da missão: " + dificuldade);
        System.out.println("Status da missão: " + status);
        System.out.println("Idade do ninja: " + idade);
    }
}
