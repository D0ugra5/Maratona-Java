package doug.devdoug.maratonajava.javacore.Bintroducaometodos.test;

import doug.devdoug.maratonajava.javacore.Bintroducaometodos.domino.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario fr = new Funcionario();
        fr.nome ="Roberto";
        fr.salarios = new double[]{2,10,5};
        fr.idade = 45;

        fr.imprimirDados();
    }
}
