package doug.devdoug.maratonajava.javacore.Aintroducaoclasses.test;

import doug.devdoug.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
         Carro cr = new Carro();
         cr.nome = "Ford Focus";
         cr.modelo = "Ret";
         cr.ano = "15/03/2014";
        Carro cr2 = new Carro();
        cr2.nome = "Lamborghini";
        cr2.modelo = "Lamborghi urus";
        cr2.ano = "15/03/2022";

        System.out.println("O  nome do carro é"+cr.nome+ " seu modelo é "+cr.modelo+ " o seu ano é "+cr.ano);
        System.out.println("O  nome do carro é"+cr2.nome+ " seu modelo é "+cr2.modelo+ " o seu ano é "+cr2.ano);


    }
}
