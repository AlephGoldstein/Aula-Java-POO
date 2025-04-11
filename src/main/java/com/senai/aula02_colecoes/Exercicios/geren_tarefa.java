package com.senai.aula02_colecoes.Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class geren_tarefa {
    public static void main(String[] args) {
        boolean value = true;
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(value) {
            System.out.println("Gerenciador de Tarefas ");
            System.out.println("Digite 1 para adicionar, ");
            System.out.println("Digite 2 para listar");
            System.out.println("Digite 3 para concluir tarefa");
            System.out.println("Digite 4 para sair \n");
            int opt = scanner.nextInt();
            scanner.nextLine();
            switch (opt){
                case 1:
                    System.out.println("Qual o nome da tarefa? ");
                    String nomeTarefa = scanner.nextLine();
                    listaTarefas.add(new Tarefa(nomeTarefa));
                    break;
                case 2:
                    System.out.println("Listando tarefas ");
                    for(Tarefa tarefa : listaTarefas){
                        System.out.println(tarefa.nome);
                    }
                    break;
                case 3:
                    System.out.println("qual o nome da tarefa a ser concluida? ");
                    String nome = scanner.nextLine();
                    for(Tarefa tarefa : listaTarefas){
                        if(tarefa.nome.equals(nome)){
                            System.out.println("Tarefa encontrada status atualizado");
                            tarefa.concluirTarefa();
                            break;
                        }
                        System.out.println("Tarefa não encontrada");
                    }
                    break;
                case 4:
                    System.out.println("Fechando sistema");
                    value = false;
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        }
        scanner.close();
    }

}
