package doug.devdoug.maratonajava.javacore.Gassociacao.dominio;

public class ProfessorEx {
    private String nome;
    private Seminario[] seminarios;

    public void imprime(){
        System.out.println("Professor "+ this.nome);
        if(this.seminarios == null)return;
        System.out.println("--- Seminarios---");
        for (Seminario seminario : this.seminarios) {
            System.out.println("--------Titulo---------");
            System.out.println(seminario.getTitulo());
            System.out.println("No local");
            System.out.println(seminario.getLocal().getEndereco());
            if(seminario.getEstudantes() == null) continue;
            System.out.println("****Alunos ****");
            for (Estudante estudante : seminario.getEstudantes()) {
                System.out.println("Alunos =>"+estudante.getNome());
                System.out.println("Idade=> "+estudante.getIdade());
            }

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
