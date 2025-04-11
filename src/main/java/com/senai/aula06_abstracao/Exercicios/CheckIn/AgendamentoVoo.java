package com.senai.aula06_abstracao.Exercicios.CheckIn;

public class AgendamentoVoo {
    private int numeroVoo;
    private String destinoVoo;
    private String agenciaAerea;

    public AgendamentoVoo(int numeroVoo, String destinoVoo, String agenciaAerea) {
        this.numeroVoo = numeroVoo;
        this.destinoVoo = destinoVoo;
        this.agenciaAerea = agenciaAerea;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getDestinoVoo() {
        return destinoVoo;
    }

    public void setDestinoVoo(String destinoVoo) {
        this.destinoVoo = destinoVoo;
    }

    public String getAgenciaAerea() {
        return agenciaAerea;
    }

    public void setAgenciaAerea(String agenciaAerea) {
        this.agenciaAerea = agenciaAerea;
    }
}
