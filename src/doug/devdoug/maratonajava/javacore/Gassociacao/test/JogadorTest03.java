package doug.devdoug.maratonajava.javacore.Gassociacao.test;

import doug.devdoug.maratonajava.javacore.Gassociacao.dominio.Jogador;
import doug.devdoug.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jg = new Jogador("Douglas");
        Jogador jg2 = new Jogador("Tamtam");

        Time tm = new Time("Barcelona");

        jg.setTime(tm);
        jg2.setTime(tm);

        Jogador[] jogadores = {jg,jg2};
        tm.setJogadores(jogadores);

        System.out.println("--------------------Jogador--------------");
        jg.imprime();
        System.out.println("--------------------time--------------");
        tm.imprime();
    }
}
