package com.senai.aula02_colecoes.Exercicios2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu de Controle de Estoque:");
            System.out.println("1. Cadastrar um novo produto");
            System.out.println("2. Listar todos os produtos");
            System.out.println("3. Atualizar a quantidade de um produto");
            System.out.println("4. Remover um produto");
            System.out.println("5. Buscar um produto pelo nome");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    atualizarProduto();
                    break;
                case 4:
                    removerProduto();
                    break;
                case 5:
                    buscarProduto();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 6);
    }

    private static void cadastrarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        estoque.add(new Produto(nome, quantidade));
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : estoque) {
                System.out.println(p);
            }
        }
    }

    private static void atualizarProduto() {
        System.out.print("Digite o nome do produto para atualizar: ");
        String nome = scanner.nextLine();
        for (Produto p : estoque) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Digite a nova quantidade: ");
                int novaQuantidade = scanner.nextInt();
                scanner.nextLine();
                p.setQuantidade(novaQuantidade);
                System.out.println("Quantidade atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    private static void removerProduto() {
        System.out.print("Digite o nome do produto para remover: ");
        String nome = scanner.nextLine();
        for (Produto p : estoque) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                estoque.remove(p);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    private static void buscarProduto() {
        System.out.print("Digite o nome do produto para buscar: ");
        String nome = scanner.nextLine();
        for (Produto p : estoque) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Produto encontrado: " + p);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
