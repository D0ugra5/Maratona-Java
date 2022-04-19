package doug.devdoug.maratonajava.javacore.Bintroducaometodos.domino;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalario;
    private double totalSalario;

    public void imprimirDados() {
        if (salarios == null )return;
        String dados = "O nome do funcionario é " + this.nome + " e tem " + this.idade + " anos";
        String salarios = "e seus salarios são \n" + this.salarios[0] + "\n" + this.salarios[1] + "\n" + this.salarios[2];
        System.out.println(dados + " \n " + salarios);

        this.mediaSalario();
    }

    public void mediaSalario() {
        for (double salario : this.salarios) {
            this.totalSalario += salario;
        }
        this.mediaSalario = totalSalario / salarios.length;
        System.out.println("a media dos salarios são " + mediaSalario);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


}
