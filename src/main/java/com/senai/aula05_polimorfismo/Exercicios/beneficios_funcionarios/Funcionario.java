package com.senai.aula05_polimorfismo.Exercicios.beneficios_funcionarios;

public class Funcionario {
    private String nome;
    private int cpf;
    private double telefone;
    private double salario;
    private String funcao;

    public Funcionario(String nome, int cpf, double telefone, double salario, String funcao) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.funcao = funcao;
    }
}
