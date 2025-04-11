package com.senai.aula06_abstracao.Exercicios.CheckIn;

import java.util.ArrayList;

public class Flysecure {

    public static void boasvindas() {
        System.out.println("Bem vindos a flysecure");
    }

    public void fazerCheckin(String cpf, int numeroVoo, ArrayList<AgendamentoVoo> agendamentoVoo, ArrayList<String> listaCpfs) {
        if (validarCpf(cpf, listaCpfs) && validarVoo(numeroVoo, agendamentoVoo)) {
            System.out.println("✅ Check-in realizado com sucesso para o voo " + numeroVoo + "!");
        } else {
            System.out.println("❌ Falha no check-in. CPF ou número de voo inválido.");
        }
    }
    public boolean validarCpf(String cpf, ArrayList<String> listaCpfs) {
        return listaCpfs.contains(cpf);
    }

    public boolean validarVoo(int numeroVoo, ArrayList<AgendamentoVoo> agendamentoVoo) {
        for (AgendamentoVoo voo : agendamentoVoo) {
            if (voo.getNumeroVoo() == numeroVoo) {
                return true;
            }
        }
        return false;
    }
}
