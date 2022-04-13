package doug.devdoug.maratonajava.javacore.Bintroducaometodos.test;

import doug.devdoug.maratonajava.javacore.Bintroducaometodos.domino.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora cr = new Calculadora();
        System.out.println("Finaliza metodo 1");
        cr.somaDoisNumeros();
        System.out.println("Finaliza metodo 2");
        cr.subtraiDoisNumeros();
    }
}
