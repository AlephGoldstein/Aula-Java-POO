package com.senai.aula06_abstracao.Exercicios.SistemaPagamentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBanco contabanco = new ContaBanco(150000);
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();

        Usuario usuario = new Usuario(nome, cpf, email, idade, telefone, contabanco);
        ContaBitcoin contaBitcoin = new ContaBitcoin();

        System.out.println("Usuário cadastrado com sucesso!");

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Definir método de pagamento e pagar");
            System.out.println("2 - Transferir para conta Bitcoin");
            System.out.println("3 - Ver extrato da conta");
            System.out.println("4 - Ver saldo Bitcoin");
            System.out.println("5 - Pagar com Bitcoin");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o método: 1 - PIX | 2 - Cartão de Crédito");
                    int metodo = scanner.nextInt();
                    System.out.print("Valor do pagamento: R$ ");
                    double valor = scanner.nextDouble();

                    MetodoPagamento pagamento = (metodo == 1) ? new Pix() : new CartaoCredito();
                    pagamento.realizarPagamento(valor, usuario.getConta());
                    break;

                case 2:
                    System.out.print("Valor para transferir para Bitcoin: R$ ");
                    double valorBTC = scanner.nextDouble();
                    contabanco.transferirParaBitcoin(contaBitcoin, valorBTC);
                    break;

                case 3:
                    usuario.getConta().exibirExtrato();
                    break;

                case 4:
                    contaBitcoin.exibirSaldoBitcoin();
                    break;
                case 5:
                    System.out.print("Valor do pagamento em Bitcoin: R$ ");
                    double pagamentoBTC = scanner.nextDouble();
                    contaBitcoin.pagarComBitcoin(pagamentoBTC);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
