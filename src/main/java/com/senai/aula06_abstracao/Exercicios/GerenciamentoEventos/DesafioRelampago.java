package com.senai.aula06_abstracao.Exercicios.GerenciamentoEventos;

public class DesafioRelampago extends Evento {
    @Override
    public void iniciarEvento() {
        System.out.println("Iniciando desafio relâmpago com instruções rápidas.");
    }

    @Override
    public void encerrarEvento() {
        System.out.println("Encerrando desafio relâmpago após o tempo limite.");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiando o participante mais rápido.");
    }
}

