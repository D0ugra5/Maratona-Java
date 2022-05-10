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
        Estudante estudante2 = new Estudante("Devon", 23);
        Estudante estudante3 = new Estudante("Alice", 21);

        seminario.setEstudantes(new Estudante[]{estudante00});
        seminario2.setEstudantes(new Estudante[]{estudante2});
        seminario3.setEstudantes(new Estudante[]{estudante3});

        ProfessorEx professorEx = new ProfessorEx("Jamile");
        ProfessorEx professorEx2 = new ProfessorEx("Jabinho");

        professorEx.setSeminarios(seminarios);
        System.out.println("----Professores e palestra------");
        professorEx.imprime();
    }
}
