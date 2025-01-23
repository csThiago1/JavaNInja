package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        *  Laços de repetição: Vão repetir infinitamente ou até você determinar parada
        * WHILE = FOR
        * */

        // WHILE
        // while (condicao) {tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

        while (numeroDeClones <= numeroMaxDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        }

        // FOR
        for (int i = 0; i <= numeroMaxDeClones; i++) {
            System.out.println("O Naruto fez um clone das sombras " + i);
        }

    }
}
