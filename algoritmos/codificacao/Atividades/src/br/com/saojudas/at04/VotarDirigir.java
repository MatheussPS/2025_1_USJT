package br.com.saojudas.at04;

import java.util.Scanner;

public class VotarDirigir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "";

        System.out.print("Insira seu ano de nascimento: ");
        int anoNasc = scanner.nextInt();

        System.out.print("Insira o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNasc;

        if(idade >= 16){
            resposta = "Tem idade para votar";
            if(idade >= 18){
                resposta+= " Tem idade para dirigir";
            }
        }
        else{
            resposta = "Não tem idade pra votar, nem para dirigir";
        }

        System.out.println(resposta);

        scanner.close();
    }
}
