package com.senai.aula01_introducao_poo.exercicios.Exercicio2;

public class Aluno {
    String nome;
    int idade;
    float nota;

    public Aluno(String nome, int idade, float nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    public void exibirInformacoes(){
        System.out.println("O aluno "+nome+" de "+idade+" anos, obteve a nota de "+nota);
    }
    public void atualizarNota(float notaNova){
        nota += notaNova;
        System.out.println("Nota atual do aluno após mudança "+nota);
    }
    public boolean verificaAprovacao(){
        if(nota >= 6.0f){
            return true;
        }else{
            return false;
        }
    }
}
