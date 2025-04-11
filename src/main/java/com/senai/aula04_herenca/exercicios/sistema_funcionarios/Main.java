package com.senai.aula04_herenca.exercicios.sistema_funcionarios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Professor> professores = new ArrayList<>();
        professores.add(new Professor ("Valdo",2500,"Filosofia"));
        professores.add(new Professor ("Cida",3900,"Português"));
        professores.add(new Professor ("João Carlos",3500,"Matemática"));
        Coordernador coordenador = new Coordernador("Tonhão", 5800, professores);
        coordenador.exibirInformacoes();

    }
}
