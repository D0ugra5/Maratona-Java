package doug.devdoug.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome abaixo");
        String nome = input.nextLine();
        System.out.println("Digite a sua idade");
        int idade = input.nextInt();
        System.out.println("Digite o m ou f para seu seu");
        char sexo = input.next().charAt(0);

        System.out.println("---------------------------");
        System.out.println("Nome "+nome);
        System.out.println("idade "+idade);
        System.out.println("Sexo "+sexo);
    }
}
