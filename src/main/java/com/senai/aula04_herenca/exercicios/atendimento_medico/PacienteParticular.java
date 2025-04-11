package com.senai.aula04_herenca.exercicios.atendimento_medico;

public class PacienteParticular extends Paciente {
    private double precoConsulta;

    public PacienteParticular(String nome, int idade, double precoConsulta) {
        super(nome, idade);
        this.precoConsulta = precoConsulta;
    }

    public double getPrecoConsulta() {
        return precoConsulta;
    }

    public void setPrecoConsulta(double precoConsulta) {
        this.precoConsulta = precoConsulta;
    }
}
