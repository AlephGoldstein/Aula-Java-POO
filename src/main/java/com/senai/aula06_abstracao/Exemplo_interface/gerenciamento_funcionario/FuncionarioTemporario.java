package com.senai.aula006_abstracao.Exemplo_interface.gerenciamento_funcionario;

public class FuncionarioTemporario extends Funcionario{
    private int horasExtras;
    private double valorHorasExtras;

    public FuncionarioTemporario(String nome, double salario, int horasExtras, double valorHorasExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
        this.valorHorasExtras = valorHorasExtras;
    }

    @Override
    public double calcularBonus() {
        return salario += horasExtras * valorHorasExtras;
    }
}
