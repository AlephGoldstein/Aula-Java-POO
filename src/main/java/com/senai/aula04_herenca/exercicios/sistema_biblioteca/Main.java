package com.senai.aula04_herenca.exercicios.sistema_biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de gerenciamento de livros da biblioteca ALLforONE");
        System.out.println("--------------------------------------");
        int opt = 0;
        while(opt != 3) {
            System.out.println("O que quer fazer?\n 1-adicionar livro,\n 2-listar livros ");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Adionando livro \n");
                    System.out.println("Qual o autor? ");
                    String autor = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Qual o titulo do livro? ");
                    String titulo = scanner.nextLine();
                    System.out.println("Qual o tipo de midia? (1-fisica, 2-digital)");
                    int opt2 = scanner.nextInt();
                    if (opt2 == 1) {
                        System.out.println("midia fisica");
                        System.out.println("Qual a quantidade de paginas");
                        int qtdpags = scanner.nextInt();
                        livros.add(new LivroFisico(titulo, autor, qtdpags));
                    } else {
                        System.out.println("midia digital");
                        System.out.println("Qual o tamanho em mb do livro");
                        double tamanhoArquivo = scanner.nextDouble();
                        livros.add(new LivroPdf(titulo, autor, tamanhoArquivo));
                    }
                    break;
                case 2:
                    System.out.println("Listando livros");
                    livros.forEach(livro -> System.out.println(livro));
                    break;
                case 3:
                    System.out.println("Saindo");
                    break;

            }
        }
    }
}
