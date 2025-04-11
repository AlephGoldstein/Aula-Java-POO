package com.senai.aula006_abstracao.Exemplo_interface.gerenciamento_funcionario;

public abstract class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void aumentarSalario(int porcentagem){
        salario += salario*((double) porcentagem /100);
    }
    public abstract double calcularBonus();

    public void exibirDados(){
        System.out.printf("\n %s recebe R$%,.2f \n",nome,salario);
    }
}
