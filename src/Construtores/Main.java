package Construtores;

public class Main {

    public static void main(String[] args) {

        Hokages Hashirama = new Hokages();
        Hashirama.idade = 45;

        Hokages Tobirama = new Hokages("Tobirama");
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages(77);
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages("Minato", 32, false);
        System.out.println(Minato.nome);
    }
}

