package br.com.saojudas.at04;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double num = scanner.nextDouble();

        if(num >= 0)
            System.out.println("Positivo");
        else
            System.out.println("Negativo");

        scanner.close();
    }
}