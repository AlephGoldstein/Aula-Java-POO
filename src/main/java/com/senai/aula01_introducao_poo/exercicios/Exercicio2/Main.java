package com.senai.aula01_introducao_poo.exercicios.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Allan",19,9.8f);
        aluno1.exibirInformacoes();
        aluno1.atualizarNota(0.1f);
        if(aluno1.verificaAprovacao()){
            System.out.println("Parabéns aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
        Aluno aluno2 = new Aluno("Gabriel",19,4.1f);
        aluno2.exibirInformacoes();
        aluno2.atualizarNota(0.5f);
        if(aluno2.verificaAprovacao()){
            System.out.println("Parabéns aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
        Aluno aluno3 = new Aluno("Bryan",17,8.4f);
        aluno3.exibirInformacoes();
        aluno3.atualizarNota(1.4f);
        if(aluno3.verificaAprovacao()){
            System.out.println("Parabéns aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}
