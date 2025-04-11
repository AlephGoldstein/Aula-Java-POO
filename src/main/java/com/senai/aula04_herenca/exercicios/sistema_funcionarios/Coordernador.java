package com.senai.aula04_herenca.exercicios.sistema_funcionarios;

import java.util.ArrayList;

public class Coordernador extends Funcionario {
    private ArrayList<Professor> equipeProfessores;

    public Coordernador(String nome, double salario, ArrayList<Professor> equipeProfessores) {
        super(nome, salario);
        this.equipeProfessores = equipeProfessores;
    }

    public ArrayList<Professor> getEquipeProfessores() {
        return equipeProfessores;
    }

    public void setEquipeProfessores(ArrayList<Professor> equipeProfessores) {
        this.equipeProfessores = equipeProfessores;
    }

    public void exibirInformacoes() {
        System.out.println("O coordenador " + getNome() + " controla a equipe: ");
        for (Professor professor : equipeProfessores) {
            System.out.println(professor.getNome());
        }
    }
}
