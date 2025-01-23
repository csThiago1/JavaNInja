package TiposDeDados;

import java.sql.SQLOutput;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        //Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo Java

        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir metodos a ele
        * Tipos primitivos NÂO recebem metodos
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); //toUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto em caixa alta: " +  nomeUpperCase);
        System.out.println("Esse texto em normal: " +  nome);

        String aldeia = "Aldeira da folha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println("Esse texto em caixa baixa: " + aldeiaLowerCase);
    }
}
