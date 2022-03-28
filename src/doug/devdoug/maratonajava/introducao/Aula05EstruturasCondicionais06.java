package doug.devdoug.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // dados os valores de 1 a 7 imprima se  e ddia util ou fina dee semana
        //considerando 1 como domingo

        byte dia = 4;
        switch (dia) {
            default:
                System.out.println("invalid option");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("business day");
                break;
            case 7:
                System.out.println("weekend");
                break;
        }
    }
}
