package Desafios.Desafio4;

public class NinjaAvancado implements Ninja{
    String nome, Habilidade, especialidade;
    int idade;

    @Override
    public void mostrarInfo() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + Habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void excutarHabilidade() {
        System.out.println("\nO ninja "+nome+" executou a habilidade "+Habilidade+" com a especialidade "+especialidade);
    }

    public NinjaAvancado(String nome, String Habilidade, int idade, String especialidade) {
        this.nome = nome;
        this.Habilidade = Habilidade;
        this.idade = idade;
        this.especialidade = especialidade;
    }
}
