package Desafios.Desafio4;

public class NinjaBasico implements Ninja{

    String nome, habilidade;
    int idade;

    public NinjaBasico(String nome, String habilidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nHabilidade: " + habilidade);
    }

    @Override
    public void excutarHabilidade() {
        System.out.println("\nO ninja " + nome + " executou a habilidade " + habilidade);
    }
}
