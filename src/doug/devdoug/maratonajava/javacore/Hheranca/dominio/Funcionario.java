package doug.devdoug.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco estatico de funcionario");
    }
    {
        System.out.println("BLoco de initialização de funcionario1");
    }
    {
        System.out.println("BLoco de initialização de funcionario2");
    }
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }


    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void realatorioPagamento() {
        System.out.println("eu" + this.nome+ "Recebi o salario"+this.salario);
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }
}
