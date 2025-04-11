package com.senai.aula006_abstracao.Exemplo_interface.smartwatch;

public class Main {
    public static void main(String[] args) {
        SmartWatch smartWatch1 = new SmartWatch();
        smartWatch1.exibirInformacaoDispositivos();
        smartWatch1.medirFrequenciaCardiaca();
    }
}
