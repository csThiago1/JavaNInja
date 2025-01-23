package TiposDeDados;

import java.sql.SQLOutput;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        *Dados primitivos - int, float, double, char, boolean, short.
        *Objetivo da aula: Criar um ninja - Naruto.
        * */

        int idade = 17; // Valor maximo: 2 147 483 647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        long saldoBancario = 999999L; // Valor Maximo: 9 231 123 132 123 123 123 123

        System.out.println(idade); // Comando para mostrar para o usuário
        System.out.println(altura);
        System.out.println(vivoOuMorto);
        System.out.println("saldoBancario = " + saldoBancario);
    }
}
