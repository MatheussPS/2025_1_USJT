package br.com.saojudas.at04;

import java.util.Scanner;

public class Categoria{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        if(idade >= 18)
            System.out.println("Categoria Adulta");

        scanner.close();
    }
}