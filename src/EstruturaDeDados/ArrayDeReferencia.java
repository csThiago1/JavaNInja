package EstruturaDeDados;

public class ArrayDeReferencia {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Folha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza Momochi";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Areia";
        ninjasEAldeias[2][1] = "Gaara do Deserto";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0] + " Ninjas: " + ninjasEAldeias[i][0] + ninjasEAldeias[i][1] + ninjasEAldeias[i][2]);
        }
    }
}
