package Condicoes;

import java.sql.SQLOutput;

public class IfElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE - Condições
        * ElseIf
        * Objetivo: Passar o ninja de nível de acordo com o numero de missoes
        * */

        // Ninja Naruto
        String nome = "Naruto";
        String rank;
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 9;

        /*
        * if (condição) {resultado}
        * else if (condição) {resultado}
        * else (caso nenhuma condição seja atendida) {resultado}
        * */

        // Se (condição) (faça isso)
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Genin");
        }
    }
}
