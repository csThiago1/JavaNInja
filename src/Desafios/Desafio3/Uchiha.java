package Desafios.Desafio3;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }
    public void mostrarInfo() {

        System.out.println("Nome: " + nome);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade da missão: " + dificuldade);
        System.out.println("Status da missão: " + status);
        System.out.println("Habilidade especial Uchiha: " + habilidadeEspecial);
    }
}
