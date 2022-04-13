package doug.devdoug.maratonajava.javacore.Bintroducaometodos.test;

import doug.devdoug.maratonajava.javacore.Bintroducaometodos.domino.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora cr = new Calculadora();
        double resultado = cr.divideDoisNumeros(2,4);
         cr.imprimeDivisaoDeDoisNumeros(2,4);
        System.out.println(resultado);
        System.out.println("--------------------");


    }
}
