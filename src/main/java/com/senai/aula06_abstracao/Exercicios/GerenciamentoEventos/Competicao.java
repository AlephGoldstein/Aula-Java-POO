package com.senai.aula06_abstracao.Exercicios.GerenciamentoEventos;

public class Competicao extends Evento {
    @Override
    public void iniciarEvento() {
        System.out.println("Iniciando competição com regras e divisão de times.");
    }

    @Override
    public void encerrarEvento() {
        System.out.println("Encerrando competição e contabilizando os pontos.");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiando os vencedores com troféus e medalhas.");
    }
}
