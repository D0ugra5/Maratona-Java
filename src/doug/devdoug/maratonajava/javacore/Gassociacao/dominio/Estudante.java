package doug.devdoug.maratonajava.javacore.Gassociacao.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public Estudante(String nome) {
        this.nome = nome;
    }

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.seminario.getTitulo());

    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
