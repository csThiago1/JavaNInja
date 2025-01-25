package Intermediario;

public class Uchiha extends Ninja implements InterfaceSharingan {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome+": Sharingan Ativado!");
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, EnumRank rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    //Sobrecarga de metodos - Informações de Combate
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é "+nome+", e essa é minha INTELIGENCIA de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: "+qi+" e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é: "+qi+" e você precisa melhorar suas estratégias");
        }
    }
}
