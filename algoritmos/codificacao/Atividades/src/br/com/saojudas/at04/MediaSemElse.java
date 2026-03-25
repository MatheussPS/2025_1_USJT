package br.com.saojudas.at04;

import java.util.Scanner;

public class MediaSemElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resultado = "Exame";

        System.out.print("Insira sua primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Insira sua segunda nota: ");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2.0;

        if (media >= 6.0)
           resultado = "Aprovado";

        System.out.println(resultado);

        scanner.close();
    }
}