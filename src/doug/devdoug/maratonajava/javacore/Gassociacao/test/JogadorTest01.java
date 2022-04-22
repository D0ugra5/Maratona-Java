package doug.devdoug.maratonajava.javacore.Gassociacao.test;

import doug.devdoug.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pele");
        Jogador jogador02 = new Jogador("Romario");
        Jogador jogador03 = new Jogador("Cafu");
        Jogador[] jogadores = new Jogador[]{jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
