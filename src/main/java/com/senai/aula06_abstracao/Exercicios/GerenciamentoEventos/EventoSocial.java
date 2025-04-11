package com.senai.aula06_abstracao.Exercicios.GerenciamentoEventos;

public class EventoSocial extends Evento {
    public void iniciarEvento() {
        System.out.println("Iniciando evento social com boas-vindas e apresentação.");
    }

    public void encerrarEvento() {
        System.out.println("Encerrando evento social com agradecimentos.");
    }

    public void premiarParticipantes() {
        System.out.println("Premiando participantes com brindes simbólicos.");
    }
}

