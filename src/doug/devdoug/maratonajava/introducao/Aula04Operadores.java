package doug.devdoug.maratonajava.introducao;

import java.util.Scanner;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+-/*
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println("valor = " + resultado);

        // %
        int resto = 22 % 4;
        System.out.println(resto);


        // < > /<= >=/ !=  / ==

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezmenorQueVinte = 10 < 20;
        boolean isIgual = 10.4 == 10.4;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezmenorQueVinte " + isDezmenorQueVinte);
        System.out.println(" isIgual " + isIgual);

        //  && (AND) / || (OR) /  !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3281;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
         float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >  valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isCompravel"+isPlaystationCincoCompravel);


        // = + -= *= /= %=
        double bonus = 1800;
        bonus +=  1000;
        bonus ++;
        System.out.println(bonus);
    }
}