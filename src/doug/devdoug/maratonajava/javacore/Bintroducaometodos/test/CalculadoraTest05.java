package doug.devdoug.maratonajava.javacore.Bintroducaometodos.test;

import doug.devdoug.maratonajava.javacore.Bintroducaometodos.domino.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = {1,2,3,4,5,6,10};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6);
    }

}
