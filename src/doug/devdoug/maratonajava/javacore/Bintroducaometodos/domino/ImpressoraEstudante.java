package doug.devdoug.maratonajava.javacore.Bintroducaometodos.domino;

public class ImpressoraEstudante {
    public void imprime (Estudante estudante){
        estudante.nome = "Carinha que mora logo ali ";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
