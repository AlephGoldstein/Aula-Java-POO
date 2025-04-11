package com.senai.aula006_abstracao.Exemplo_interface.gerenciamento_funcionario;

public class FuncionarioEfetivo extends Funcionario{
    private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    @Override
    public double calcularBonus() {
        return salario += bonusMensal;
    }
}
