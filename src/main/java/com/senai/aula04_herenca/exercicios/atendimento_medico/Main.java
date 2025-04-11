package com.senai.aula04_herenca.exercicios.atendimento_medico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Clinica Médica");
        System.out.println("________________________________");
        System.out.println("Vamos fazer seu cadastro de paciente ");
        System.out.println("--------------------------------");
        System.out.println("Qual seu nome?");
        String nome = scanner.next();
        scanner.nextLine();
        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();
        System.out.println("É convenio ou Particular? (1,2)");
        int opt = 0;
        opt = scanner.nextInt();
        switch(opt){
            case 1:
                System.out.println("Convenio");
                PacienteConvenio paciente = new PacienteConvenio(nome,idade,6);
                break;
            case 2:
                System.out.println("Particular");
                PacienteParticular paciente2 = new PacienteParticular(nome,idade,152);
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
