package doug.devdoug.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodio;
    private String nome;
    private String genero;


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.episodio);
        System.out.println(this.genero);
        System.out.println(this.tipo);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;

    }
    public int getEpisodio(){
        return this.episodio;
    }
}
