package doug.devdoug.maratonajava.javacore.Gassociacao.test;

import doug.devdoug.maratonajava.javacore.Gassociacao.dominio.Escola;
import doug.devdoug.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor pr = new Professor("Jiraya");
        Professor pr2 = new Professor("Jiraya2");
        Escola es = new Escola("Konoha",new Professor[]{pr,pr2});
        es.imprime();
    }
}
