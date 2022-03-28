package doug.devdoug.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double primeiroImposto = 9.70 / 100;
        double segundoImposto = 37.35 / 100;
        double terceiroImposto  =   49.50/ 100;
        double salario = 70000;
        double valorDoImposto = 0;

        if(salario <= 34712){
            valorDoImposto  =salario * primeiroImposto;
        }else if( salario > 34712&& salario < 68508){
            valorDoImposto  =salario * segundoImposto;
        }else{
            valorDoImposto  =salario * terceiroImposto;
        }
        System.out.println(valorDoImposto );

    }
}
