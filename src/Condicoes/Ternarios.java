package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: Maneiras de reduzir os codigos
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
        * */

        short numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);

        int resultado = (5 > 3) ? 10 : 20;
        System.out.println(resultado);
    }
}
