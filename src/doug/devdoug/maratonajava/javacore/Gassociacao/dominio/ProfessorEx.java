package doug.devdoug.maratonajava.javacore.Gassociacao.dominio;

public class ProfessorEx {
    private String nome;
    private Seminario[] seminarios;

    public void imprime(){
        System.out.println("Professor "+ this.nome);
        if(seminarios == null)return;
        for (Seminario seminario : seminarios) {
            System.out.println("---nome da Palestra---");
            System.out.println(seminario.getTitulo());
        }

    }
    public ProfessorEx(String nome) {
        this.nome = nome;
    }

    public ProfessorEx(String nome, Seminario[] seminarios) {
        this.nome = nome;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
