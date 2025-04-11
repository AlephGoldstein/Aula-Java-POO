package com.senai.aula05_polimorfismo.Exercicios.sistema_hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Pessoa> pessoasCadastradas = new ArrayList<>();

        int opt;
        boolean cadastroEncontrado = false;
        Pessoa pessoa = null;

        System.out.println("------------------ Hotel Mazzionil -------------------");
        System.out.println("Já possui cadastro? (1 - Sim, 2 - Não)");
        opt = scanner.nextInt();
        scanner.nextLine();

        if (opt == 1) {
            System.out.println("Digite o CPF para verificar o cadastro:");
            int cpf = scanner.nextInt();
            for (Pessoa p : pessoasCadastradas) {
                if (p.getCpf() == cpf) {
                    pessoa = p;
                    cadastroEncontrado = true;
                    break;
                }
            }
            if (!cadastroEncontrado) {
                System.out.println("Cadastro não encontrado. Por favor, realize o cadastro.");
            }
        }

        if (!cadastroEncontrado) {
            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Digite seu CPF:");
            int cpf = scanner.nextInt();
            System.out.println("Digite seu telefone:");
            int telefone = scanner.nextInt();

            pessoa = new Pessoa(nome, cpf, telefone);
            pessoasCadastradas.add(pessoa);
            System.out.println("Cadastro realizado com sucesso!");
        }

        int reservaOpt;
        do {
            System.out.println("\nEscolha o tipo de reserva:");
            System.out.println("1 - Reserva Simples");
            System.out.println("2 - Reserva VIP");
            System.out.println("3 - Sair");
            reservaOpt = scanner.nextInt();
            scanner.nextLine();

            switch (reservaOpt) {
                case 1:
                    System.out.println("Digite o valor da reserva simples:");
                    double valorSimples = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Digite a data do agendamento (formato: dd/MM/yyyy):");
                    String dataSimples = scanner.nextLine();
                    Date dataReservaSimples = new Date();

                    ReservaSimples reservaSimples = new ReservaSimples(pessoa, valorSimples, dataReservaSimples);
                    double valorFinalSimples = reservaSimples.calcularTodo(valorSimples);
                    System.out.println("Reserva simples realizada com sucesso! Valor final: R$ " + valorFinalSimples);
                    break;

                case 2:
                    System.out.println("Digite o valor da reserva VIP:");
                    double valorVip = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Digite a data do agendamento (formato: dd/MM/yyyy):");
                    String dataVip = scanner.nextLine();
                    Date dataReservaVip = new Date();

                    ReservaVip reservaVip = new ReservaVip(pessoa, valorVip, dataReservaVip);
                    double valorFinalVip = reservaVip.calcularTodo(valorVip);
                    System.out.println("Reserva VIP realizada com sucesso! Valor final: R$ " + valorFinalVip);
                    break;

                case 3:
                    System.out.println("Saindo... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (reservaOpt != 3);
    }
}
