package com.senai.aula006_abstracao.Exemplo_interface.gerenciamento_funcionario;

public class Main {
    public static void main(String[] args) {
    testarPagamento(new FuncionarioEfetivo("Brailes",1500,100));
    testarPagamento(new FuncionarioTemporario("Allan",3000,15,38));
    }
    public static void testarPagamento(Funcionario funcionario){
        System.out.println("_____________________ testanto funcionario _____________________");
        funcionario.exibirDados();
        funcionario.aumentarSalario(10);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();

    }
}
