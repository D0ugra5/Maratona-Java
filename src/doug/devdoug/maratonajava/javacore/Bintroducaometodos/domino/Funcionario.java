package doug.devdoug.maratonajava.javacore.Bintroducaometodos.domino;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;


    public void imprimirDados() {
        if (salarios == null )return;
        String dados = "O nome do funcionario é " + this.nome + " e tem " + this.idade + " anos";
        String salarios = "e seus salarios são \n" + this.salarios[0] + "\n" + this.salarios[1] + "\n" + this.salarios[2];
        System.out.println(dados + " \n " + salarios);

        this.mediaSalario();
    }

    public void mediaSalario() {
        double totalSalario = 0;
        double mediaSalario = 0;
        for (double salario : this.salarios) {
            totalSalario += salario;
        }
        mediaSalario = totalSalario / salarios.length;
        System.out.println("a media dos salarios são " + mediaSalario);
    }

}
