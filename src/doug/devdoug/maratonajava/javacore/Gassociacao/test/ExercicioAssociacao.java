package doug.devdoug.maratonajava.javacore.Gassociacao.test;

import doug.devdoug.maratonajava.javacore.Gassociacao.dominio.Estudante;
import doug.devdoug.maratonajava.javacore.Gassociacao.dominio.Local;
import doug.devdoug.maratonajava.javacore.Gassociacao.dominio.ProfessorEx;
import doug.devdoug.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class ExercicioAssociacao {
    public static void main(String[] args) {
        Local local = new Local("Rua dos almirantes 103");

        Seminario seminario = new Seminario("Palestra Sobre dados", local);
        Seminario seminario2 = new Seminario("Palestra Sobre Mercado", local);
        Seminario seminario3 = new Seminario("Palestra Sobre Peixe", local);
        Seminario[] seminarios = {seminario,seminario2,seminario3};

        Estudante estudante00 = new Estudante("Douglas", 22);
        estudante00.setSeminario(seminario);

        Estudante estudante2 = new Estudante("Devon", 23);
        estudante2.setSeminario(seminario2);

        Estudante estudante3 = new Estudante("Alice", 21);
        estudante3.setSeminario(seminario3);

        ProfessorEx professorEx = new ProfessorEx("Jamilee");
        professorEx.setSeminarios(seminarios);

        ProfessorEx professorEx2 = new ProfessorEx("Jabinho");
        professorEx2.setSeminarios(seminarios);

        Estudante[] estudantes = {estudante00, estudante2, estudante3};
        seminario.setEstudantes(estudantes);

        System.out.println("----Alunos nos Seminarios, titulos e local------");

        for (Seminario ssm : seminarios) {
            ssm.imprime();
        }

        System.out.println("----Professores e palestra------");
        professorEx.imprime();
        professorEx2.imprime();

        System.out.println("----Alunos------");
        for (Estudante est : estudantes) {
            est.imprime();
            System.out.println("-------------");
        }

    }
}
