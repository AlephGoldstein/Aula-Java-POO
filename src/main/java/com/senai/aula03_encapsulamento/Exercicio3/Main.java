package com.senai.aula03_encapsulamento.Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionarios> funcionario = new ArrayList<>();
        ArrayList<String> cargos_possiveis = new ArrayList<>();
        cargos_possiveis.add("Gerente");
        cargos_possiveis.add("Analista");
        cargos_possiveis.add("Programador");

        int opt = 0;
        while(opt != 4){
            System.out.println("Sistema de cadastro de novos funcionários");
            System.out.println("Escolha uma opção \n" +
                    "1 - Cadastrar funcionário \n" +
                    "2 - Aumentar salario \n" +
                    "3 - exibir funcionarios \n" +
                    "4 - sair");
            opt = scanner.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Digite o nome do funcionário ");
                    String nome = scanner.next();
                    System.out.println("Digite o salario dele: ");
                    scanner.nextLine();
                    double salario = scanner.nextDouble();
                    System.out.println("Qual o cargo dele");
                    String cargo = scanner.next();
                    funcionario.add(new Funcionarios(nome,salario,cargo,cargos_possiveis));
                    break;
                case 2:
                    System.out.println("Aumentar salario: ");
                    System.out.println("Qual o nome do funcionário: ");
                    String nomefunc = scanner.next();
                    System.out.println("Qual o aumento no salário dele: ");
                    double newsalario = scanner.nextDouble();
                    for( Funcionarios fuds: funcionario){
                        if(fuds.getNome().equals(nomefunc)){
                            fuds.aumentarSalario(fuds.getSalario(),newsalario);
                        }else{
                            System.out.println("Funcionario não encontrado");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Qual o nome do funcionário: ");
                    String nomefunc2 = scanner.next();
                    for(Funcionarios func : funcionario){
                        if(func.getNome().equals(nomefunc2)){
                            System.out.println("Funcionario: "+func.getNome()+"\n");
                            System.out.println("E ele ganha "+func.getSalario());

                        }else{
                            System.out.println("Funcionario não encontrado");
                }
                    }
                    break;
                case 4:
                    break;
                default:
                    throw new IllegalArgumentException("Opção invalida");
            }
        }
    }


}
