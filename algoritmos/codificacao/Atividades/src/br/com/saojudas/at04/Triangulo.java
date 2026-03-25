package br.com.saojudas.at04;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Insira o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Insira o valor de c: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("É possível formar um triângulo");
        else
            System.out.println("Não é possível formar um triângulo");

        scanner.close();
    }
}
