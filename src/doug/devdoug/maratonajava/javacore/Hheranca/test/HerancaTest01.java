package doug.devdoug.maratonajava.javacore.Hheranca.test;

import doug.devdoug.maratonajava.javacore.Hheranca.dominio.Endereco;
import doug.devdoug.maratonajava.javacore.Hheranca.dominio.Funcionario;
import doug.devdoug.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco= new Endereco();
        endereco.setCep("0433");
        endereco.setRua("Leon");
        Pessoa pessoa= new Pessoa("Doug");
        pessoa.setCpf("4343434343");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
//        ----------------------------------------------------
        Funcionario funcionario = new Funcionario("give up to me");
        funcionario.setCpf("222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("---------------------------");
        funcionario.imprime();

    }
}
