package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Naruto = new NinjaBasico("Naruto Uzumaki", "Rasengan", 17);
        TipoHabilidade Rasengan = TipoHabilidade.Ninjutsu;
        Naruto.mostrarInfo();
        Naruto.excutarHabilidade();

NinjaAvancado Itachi = new NinjaAvancado("Itachi Uchiha", "Tsukuyomi", 25, "Ilusão");
TipoHabilidade Tsukuyomi = TipoHabilidade.Genjutsu;
Itachi.mostrarInfo();
Itachi.excutarHabilidade();
    }
}
