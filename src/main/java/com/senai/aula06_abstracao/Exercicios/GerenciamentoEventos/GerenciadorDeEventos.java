package com.senai.aula06_abstracao.Exercicios.GerenciamentoEventos;

public class GerenciadorDeEventos {
    public void executarEvento(Evento evento) {
        evento.iniciarEvento();
        evento.encerrarEvento();
        evento.premiarParticipantes();
    }
}

