package com.senai.aula_007_mvc.crud_usuario.view;

import com.senai.aula_007_mvc.crud_usuario.controller.OperadorController;
import com.senai.aula_007_mvc.crud_usuario.controller.SupervisorController;
import com.senai.aula_007_mvc.crud_usuario.model.Operador;
import com.senai.aula_007_mvc.crud_usuario.model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opControler = new OperadorController();
        SupervisorController supController = new SupervisorController();

        String menu = """
                MENU 
                1 - Cadastrar Usuario
                2 - Deletar Usuario
                3 - Atualizar usuario
                4 - Exibir Usuario
                5 - Ligar máquina
                6 - Demitir operador
                7 - Sair
                """;
        int opt = 0;
        do {
            System.out.println(menu);
            opt = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual tipo de usuário? ");
            System.out.println("1 - Operador");
            System.out.println("2 - Supervisor");
            int escolhaTipo = scanner.nextInt();
            scanner.nextLine();

            switch(opt){
                case 1:
                    System.out.println("Preencha os dados a seguir");
                    System.out.println("ID");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nome:");
                    String nome = scanner.nextLine();

                    if( escolhaTipo == 1) {
                        System.out.println("Setor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome,id,setor);
                        if(opControler.cadastrarOperador(operador)){
                            System.out.println("Cadastrado com sucesso");
                        }else{
                            System.out.println("Não foi possivel cadastrar!");
                        }
                    }else if(escolhaTipo == 2){
                        System.out.println("Area: ");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome,id,area);
                        if(supController.cadastrarSupervisor(supervisor)){
                            System.out.println("Cadastrado com sucesso");
                        }else{
                            System.out.println("Não foi possivel cadastrar!");
                        }

                    }
                    break;
                case 2:
                    if(escolhaTipo == 1){
                        opControler.listarOperadores();
                    }else if(escolhaTipo == 2){
                        supController.listarSupervisores();
                }
                    System.out.println("Escolha um usuario para deletar");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    if(escolhaTipo == 1){
                        opControler.deletarOperador(id);
                    } else if (escolhaTipo == 2) {
                        supController.deletarSupervisor(id);
                    }
                    break;
                case 3:
                    if(escolhaTipo == 1){
                        opControler.listarOperadores();
                    }else if(escolhaTipo == 2){
                        supController.listarSupervisores();
                    }
                    System.out.println("Escolha um usuario para atualizar");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Atualize as seguintes informações: ");
                    System.out.println("Nome: ");
                    nome = scanner.nextLine();
                    if(escolhaTipo == 1){
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome,id,setor);
                        if(opControler.atualizarOperador(operador)){
                            System.out.println("Usuário atualizado com sucesso! ");
                        }else{
                            System.out.println("Erro ao atualizar usuario! ");
                        }
                    } else if (escolhaTipo == 2) {
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome,id,area);
                        if(supController.atualizarSupervisor(supervisor)){
                            System.out.println("Usuário atualizado com sucesso! ");
                        }else{
                            System.out.println("Erro ao atualizar usuario! ");
                        }
                    }
                    break;
                case 4:
                    if(escolhaTipo == 1){
                        opControler.listarOperadores();
                    }else if(escolhaTipo == 2){
                        supController.listarSupervisores();
                    }
                    break;
                case 5:
                    System.out.println("Ligando maquina");
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opt != 7);

    }
}
