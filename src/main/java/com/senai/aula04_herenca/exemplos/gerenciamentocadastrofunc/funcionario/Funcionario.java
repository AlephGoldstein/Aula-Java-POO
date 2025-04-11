package com.senai.aula04_herenca.exemplos.gerenciamentocadastrofunc.funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void exibirInformacoes(){
        System.out.printf("nome do funcionario: %s, salario R$%,.2f \n",nome,salario);
    }
}
