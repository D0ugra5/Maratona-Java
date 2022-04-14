package doug.devdoug.maratonajava.javacore.Bintroducaometodos.test;

import doug.devdoug.maratonajava.javacore.Bintroducaometodos.domino.Estudante;
import doug.devdoug.maratonajava.javacore.Bintroducaometodos.domino.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante01 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante.nome = "midle";
        estudante.idade = 15;
        estudante.sexo = 'm';


        estudante01.nome = "sakura";
        estudante01.idade = 16;
        estudante01.sexo = 'f';
        estudante.imprime();
        estudante01.imprime();
    }
}
