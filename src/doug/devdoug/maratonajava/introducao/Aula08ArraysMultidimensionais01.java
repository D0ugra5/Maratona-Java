package doug.devdoug.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
            // 1,2,3,4,5 meses
           //31,28,31,30 dias
        int[][] dias = new int[2][2];
        dias[0][0] =0;
        dias[0][1] =2;

        dias[1][0] =45;
        dias[1][1] =43;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {

                System.out.println(dias[i][j]);
            }
        }
        for (int[ ] arrayBase: dias) {
            for (int num:arrayBase) {
                System.out.println(num);
            }
        }
    }
}
