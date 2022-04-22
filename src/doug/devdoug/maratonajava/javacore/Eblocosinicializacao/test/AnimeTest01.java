package doug.devdoug.maratonajava.javacore.Eblocosinicializacao.test;

import doug.devdoug.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        System.out.println();
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio);
        }

    }
}
