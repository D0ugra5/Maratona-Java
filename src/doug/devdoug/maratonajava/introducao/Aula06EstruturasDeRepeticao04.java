package doug.devdoug.maratonajava.introducao;

import java.lang.Math;

public class Aula06EstruturasDeRepeticao04 {
    //dado o valor de um carro , descubra quantas vezees ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorDoCarro = 30000;

        for (int i = 1; i <= valorDoCarro; i++) {
            double parcela = valorDoCarro / i;
            if(parcela < 1000){
                break;
            }

            System.out.println("Você pode parcelar em  " + i + "   Valor da Parcela R$  " + Math.round(parcela));

        }

    }
}
