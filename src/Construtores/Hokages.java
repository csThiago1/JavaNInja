package Construtores;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuMorto;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract void sabedoriaHokage();

    public Hokages(String nome, int idade, boolean vivoOuMorto, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }

    public Hokages() {
        // Construtor vazio, sem args
    }

    // Construtor com args
    public Hokages(String nome) {
        this.nome = nome;
    }
    public Hokages(int idade){
        this.idade = idade;
    }

    // AllArgs Constructor: contém todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }

}
