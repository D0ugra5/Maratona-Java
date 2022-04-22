package doug.devdoug.maratonajava.javacore.Fmodoficadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios ;

     static {
        System.out.println("dentro do bloco ");
        Anime.episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;

        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int ep:episodios) {
            System.out.println(ep);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
