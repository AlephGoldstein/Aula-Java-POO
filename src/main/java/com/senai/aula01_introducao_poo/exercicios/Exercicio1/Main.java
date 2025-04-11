package com.senai.aula01_introducao_poo.exercicios.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto1 = new Produto("Leite",12.5f, 20);
        produto1.exibirDetalhes();
        System.out.println("Vai acrescentar? (S/N) ");
        String resp =  scanner.nextLine();
        if(resp.toLowerCase().equals("s")){
            produto1.atualizaEstoque(true,2);
        }else if(resp.toLowerCase().equals("n")){
            produto1.atualizaEstoque(false,2);
        }else{
            System.out.println("Erro");
        }

        produto1.calcularValorEstoque();
        Produto produto2 = new Produto("Chocolate",7.5f,32);
        produto2.exibirDetalhes();
        System.out.println("Vai acrescentar? (S/N) ");
        String resp2 =  scanner.nextLine();
        if(resp2.toLowerCase().equals("s")){
            produto2.atualizaEstoque(true,2);
        }else if(resp2.toLowerCase().equals("n")){
            produto2.atualizaEstoque(false,2);
        }else{
            System.out.println("Erro");
        }
        produto2.calcularValorEstoque();
    }
}
