package doug.devdoug.maratonajava.javacore.Csobrecargametodos.test;

import doug.devdoug.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime an = new Anime();
        an.setTipo("TV");
        an.setNome("Akudama Drive");
        an.setEpisodio(01);
        an.imprime();

    }
}
