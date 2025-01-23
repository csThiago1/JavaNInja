package EstruturaDeDados;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String nomeDoNinja = "Gaara do Deserto";

        // Arrays sao tipo referencia!
        String[] ninja = new String[7];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        ninja[5] = nomeDoNinja;

        System.out.println(ninja[6]);
        System.out.println(Arrays.toString(ninja));

        String nomeDoNinja2 = ninja[0];
        System.out.println(nomeDoNinja2);

        // Redeclarar
        // Redeclarar escreve em cima do array anterior
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikazi";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        //System.out.println(ninja[2]);

        // FOR para fazer um LOOP no array
        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }

        // Array idade
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[0]);
    }
}
