package Intermediario;

public class Hatake extends Ninja implements InterfaceSharingan, InterfaceAnbu, InterfaceHokage {

    public Hatake() {
        super();
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Hatake(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, EnumRank rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void nivelHokage() {
        System.out.println("Eu sou o sétimo Hokage da Aldeia da folha");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome+": Sharingan Ativado!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome+": Eu sou um ninja da Anbu!");
    }

}
