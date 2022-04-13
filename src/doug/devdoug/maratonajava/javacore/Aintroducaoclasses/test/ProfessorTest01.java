package doug.devdoug.maratonajava.javacore.Aintroducaoclasses.test;

import doug.devdoug.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor pf = new Professor();
        pf.nome = "JabinhoProgramaFino";
        pf.sexo ='m';
        pf.idade =24;
        String dadosProfessor = "O nome do Professor é  " + pf.nome + " do sexo "+pf.sexo+ " Sua idade é " + pf.idade;
        System.out.println(dadosProfessor);
    }
}
