package doug.devdoug.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
         int numeroImpressao = 50;

         for (int i = 0 ; i <= numeroImpressao; i++){
             if(i > 25){
                 break;
             }
             System.out.println("Number"+ i);
         }

    }
}
