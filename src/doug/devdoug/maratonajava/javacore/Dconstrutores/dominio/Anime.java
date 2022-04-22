package doug.devdoug.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodio;
    private String nome;
    private String genero;
    private String estudio;

    public Anime(String nome, int episodio,String tipo,String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodio = episodio;
    }

    public Anime(String nome, int episodio,String tipo,String genero, String estudio){
        this(nome,episodio,tipo,genero);
        this.estudio = estudio;
    }
    public Anime (){
        System.out.println("Dentro do construtor sem argumentos ");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.episodio);
        System.out.println(this.genero);
        System.out.println(this.tipo);
        System.out.println(this.estudio);
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
