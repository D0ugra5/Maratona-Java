package doug.devdoug.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
       //doar se salario for maior que 5000
        double salario = 6000;
        String mensagemDoar = "eu vou doar 500 para o devDojo";
        String mensagemNaoDoar = "ainda não tenho condição, mas vou ter";
        String resultado = ( salario > 2500) ? mensagemDoar : mensagemNaoDoar ;

        System.out.println(resultado);
    }
}
