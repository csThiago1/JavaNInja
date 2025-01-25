package Intermediario;

// Herança:

public abstract class Ninja implements InterfaceInfoBatalha {

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas , Rank
    //TODO: Rank: Genin, Chuunin, Jounin, kage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    EnumRank rank;

    public Ninja() {
    }

    //PRIMEIRO METODO
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do constructor chamando os novos atributos
    //SOBRECARGA: REFERENCIA OS DADOS JÁ UTILIZADOS E APRESENTA OS NOVOS

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, EnumRank rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodo gereal! Todos os ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome);
    }

    //Reescrevendo o metodo da interface

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Meu nome é " + nome+ " ,e essa é minha ESTRATEGIA de combate");
    }


    //Sobrecarga de metodos - Informações de Combate

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " ,e essa é minha INTELIGENCIA de combate");
    }

    //Sobrecarga de metodos - Informações de Combate

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

