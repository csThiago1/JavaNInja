package Intermediario;

public class Main {
    public static void main(String[] args) {


        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 17, 6, EnumRank.GENIN);
        sasuke.nomeDoNinja();
        sasuke.habilidadeEspecial();
        sasuke.sharinganAtivado();

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 45, 99, EnumRank.KAGE);
        madara.nomeDoNinja();
        madara.habilidadeEspecial();
        madara.sharinganAtivado();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(15);

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27, 60, EnumRank.JOUNIN);
        itachi.nomeDoNinja();
        itachi.habilidadeEspecial();
        itachi.sharinganAtivado();

        Hatake kakashi = new Hatake("Kakashi Hatake", "Aldeia da Folha", 55, 99, EnumRank.KAGE);
        kakashi.nomeDoNinja();
        kakashi.habilidadeEspecial();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.nivelHokage();

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 8, EnumRank.GENIN);
        naruto.nomeDoNinja();
        naruto.habilidadeEspecial();
    }
}
