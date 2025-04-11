package com.senai.aula02_colecoes.Exercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Tarefa {
    String nome;
    boolean Realizado;

    public Tarefa(String tarefa) {
        this.nome = tarefa;
    }

    public void concluirTarefa(){
        this.Realizado = true;
    }

}
