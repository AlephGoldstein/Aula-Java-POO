package com.senai.aula04_herenca.exercicios.atendimento_medico;

public class PacienteConvenio extends Paciente {
    private double descontoConvenio;

    public PacienteConvenio(String nome, int idade, double descontoConvenio) {
        super(nome, idade);
        this.descontoConvenio = descontoConvenio;
    }

    public double getDescontoConvenio() {
        return descontoConvenio;
    }

    public void setDescontoConvenio(double descontoConvenio) {
        this.descontoConvenio = descontoConvenio;
    }
}
