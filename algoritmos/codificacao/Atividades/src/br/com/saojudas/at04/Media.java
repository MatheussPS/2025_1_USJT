package br.com.saojudas.at04;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Insira sua segunda nota: ");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2.0;

        if (media >= 6.0)
            System.out.println("Aprovado");
        else
            System.out.println("Exame");

        scanner.close();
    }
}
