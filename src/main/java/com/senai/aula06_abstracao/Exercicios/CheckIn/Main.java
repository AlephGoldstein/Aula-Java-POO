package com.senai.aula06_abstracao.Exercicios.CheckIn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AgendamentoVoo> agendamentosVoos = new ArrayList<>();
        ArrayList<String> listaCpfs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Flysecure flysecure = new Flysecure();

        agendamentosVoos.add(new AgendamentoVoo(125, "Bahia", "Azul"));
        agendamentosVoos.add(new AgendamentoVoo(777, "São Paulo", "Latam"));

        int opt;
        do {
            Flysecure.boasvindas();
            System.out.println("\n--- Menu Flysecure ---");
            System.out.println("1 - Fazer Check-in");
            System.out.println("2 - Cadastro");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opt = scanner.nextInt();
            scanner.nextLine();

            switch (opt) {
                case 1:
                    System.out.print("Digite seu CPF: ");
                    String cpfCheck = scanner.nextLine();
                    if (listaCpfs.contains(cpfCheck)) {
                        System.out.print("Digite o número do voo: ");
                        int numeroVoo = scanner.nextInt();
                        scanner.nextLine();
                        flysecure.fazerCheckin(cpfCheck, numeroVoo, agendamentosVoos, listaCpfs);
                    } else {
                        System.out.println("CPF não cadastrado. Faça o cadastro antes.");
                    }
                    break;
                case 2:
                    System.out.print("Digite seu CPF para cadastro: ");
                    String novoCpf = scanner.nextLine();
                    if (!listaCpfs.contains(novoCpf)) {
                        listaCpfs.add(novoCpf);
                        System.out.println("Cadastro realizado com sucesso.");
                    } else {
                        System.out.println("CPF já cadastrado.");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opt != 3);
    }
}
