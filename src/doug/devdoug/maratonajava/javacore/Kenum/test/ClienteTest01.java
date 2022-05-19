package doug.devdoug.maratonajava.javacore.Kenum.test;

import doug.devdoug.maratonajava.javacore.Kenum.dominio.Cliente;
import doug.devdoug.maratonajava.javacore.Kenum.dominio.Cliente.TipoPagamento;
import doug.devdoug.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cl = new Cliente("Douglas", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cl2 = new Cliente("Douglas", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cl);
        System.out.println(cl2);

    }
}