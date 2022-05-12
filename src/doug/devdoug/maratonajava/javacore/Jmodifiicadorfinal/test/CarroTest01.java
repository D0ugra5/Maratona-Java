package doug.devdoug.maratonajava.javacore.Jmodifiicadorfinal.test;

import doug.devdoug.maratonajava.javacore.Jmodifiicadorfinal.dominio.Carro;
import doug.devdoug.maratonajava.javacore.Jmodifiicadorfinal.dominio.Comprador;
import doug.devdoug.maratonajava.javacore.Jmodifiicadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        System.out.println(carro.COMPRADOR);
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("kirito");
        System.out.println(carro.COMPRADOR);

        Ferrari fr  = new Ferrari();
        fr.setNome("Enzo");
        fr.imprime();

    }
}
