package doug.devdoug.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int i = (int) valorTotal ; i >= 1 ; i--) {
            double parcela = valorTotal / i;
            if(parcela < 1000){
                continue;
            }
            System.out.println("Você pode parcelar em  " + i + "   Valor da Parcela R$  " + Math.round(parcela));
        }
    }

}
