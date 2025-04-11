package com.senai.aula04_herenca.exercicios.gestao_pedidos;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> esfihas = new HashMap<String, Double>() {{
            put("Esfiha de Carne", 5.50);
            put("Esfiha de Frango", 4.50);
            put("Esfiha de Queijo", 3.00);
            put("Esfiha Vegana", 6.00);
        }};

        int numeroPedido = (int) (Math.random() * 1000);

        System.out.println("Qual tipo de pedido você deseja fazer?");
        System.out.println("1 - Pedido Online");
        System.out.println("2 - Pedido Presencial");

        int tipoPedido = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escolha a esfiha:");
        System.out.println("1 - Esfiha de Carne");
        System.out.println("2 - Esfiha de Frango");
        System.out.println("3 - Esfiha de Queijo");
        System.out.println("4 - Esfiha Vegana");

        int escolhaEsfiha = scanner.nextInt();
        String nomeEsfiha = "";
        double valorEsfiha = 0.0;

        switch (escolhaEsfiha) {
            case 1:
                nomeEsfiha = "Esfiha de Carne";
                valorEsfiha = esfihas.get(nomeEsfiha);
                break;
            case 2:
                nomeEsfiha = "Esfiha de Frango";
                valorEsfiha = esfihas.get(nomeEsfiha);
                break;
            case 3:
                nomeEsfiha = "Esfiha de Queijo";
                valorEsfiha = esfihas.get(nomeEsfiha);
                break;
            case 4:
                nomeEsfiha = "Esfiha Vegana";
                valorEsfiha = esfihas.get(nomeEsfiha);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        if (tipoPedido == 1) {
            // Pedido Online
            System.out.println("Digite a taxa de entrega:");
            double taxaEntrega = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite o endereço de entrega:");
            String endereco = scanner.nextLine();

            PedidoOnline pedidoOnline = new PedidoOnline(numeroPedido, valorEsfiha, taxaEntrega, endereco);
            pedidoOnline.exibirDetalhes();
        } else if (tipoPedido == 2) {

            System.out.println("Digite o desconto à vista:");
            double descontoAvista = scanner.nextDouble();

            PedidoPresencial pedidoPresencial = new PedidoPresencial(numeroPedido, valorEsfiha, descontoAvista);
            pedidoPresencial.exibirDetalhes();
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
