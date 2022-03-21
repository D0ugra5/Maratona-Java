package doug.devdoug.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if (isAutorizadoComprarBebida) {
            System.out.println("autorizado a compra bebida alcoolica");
        } else {
            System.out.println("não autorizado a compra bebida alcoolica");
        }


    }
}
