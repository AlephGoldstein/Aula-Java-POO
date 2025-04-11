package com.senai.aula06_abstracao.Exercicios.GerenciamentoEventos;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeEventos gerenciador = new GerenciadorDeEventos();

        Evento social = new EventoSocial();
        Evento competicao = new Competicao();
        Evento desafio = new DesafioRelampago();

        gerenciador.executarEvento(social);
        gerenciador.executarEvento(competicao);
        gerenciador.executarEvento(desafio);
    }
}
