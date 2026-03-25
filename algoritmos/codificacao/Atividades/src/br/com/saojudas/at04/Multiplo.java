package br.com.saojudas.at04;

import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double num = scanner.nextDouble();

        if (num % 15 == 0)
           System.out.println("É múltiplo de 3 e 5");
        else
            System.out.println("Não é múltiplo de 3 e 5 ao mesmo tempo");

        scanner.close();
    }
}
