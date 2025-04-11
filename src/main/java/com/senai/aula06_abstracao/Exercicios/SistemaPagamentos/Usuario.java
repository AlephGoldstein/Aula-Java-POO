package com.senai.aula06_abstracao.Exercicios.SistemaPagamentos;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private int idade;
    private int telefone;
    private ContaBanco conta;

    public Usuario(String nome, String cpf, String email, int idade, int telefone, ContaBanco conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
        this.conta = conta;
    }

    public ContaBanco getConta() {
        return conta;
    }

}
