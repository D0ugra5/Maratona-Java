package doug.devdoug.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Local local;
    private Estudante[] estudantes;

    public void imprime() {
        if (estudantes == null) return;
        for (Estudante estudante : estudantes) {
            System.out.println("---");
            System.out.println(estudante.getNome());
            System.out.println(estudante.getSeminario().getTitulo());
            System.out.println(estudante.getSeminario().getLocal().getEndereco());

        }

    }

    public Seminario(String titulo, Local local, Estudante[] estudantes) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = estudantes;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String nome) {
        this.titulo = nome;
    }

}
