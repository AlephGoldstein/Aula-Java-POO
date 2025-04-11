package com.senai.aula03_encapsulamento.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SISTEMA INVENTÁRIO");
        System.out.println("Digite o nome do produto que quer adicionar ");
        String nomeProd = scanner.nextLine();
        System.out.println("Qual o valor do produto ");
        Double valor= scanner.nextDouble();
        Produto arroz = new Produto(nomeProd,valor);
        arroz.setNome("Milho");
        System.out.println(arroz.getNome());



    }


}
