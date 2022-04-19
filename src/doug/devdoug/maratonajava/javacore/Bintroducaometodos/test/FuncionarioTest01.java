package doug.devdoug.maratonajava.javacore.Bintroducaometodos.test;

import doug.devdoug.maratonajava.javacore.Bintroducaometodos.domino.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario fr = new Funcionario();
        fr.setNome("Roberto");;
        fr.setSalarios(new double[]{2,10,5});
        fr.setIdade(45);
        fr.imprimirDados();
    }
}
