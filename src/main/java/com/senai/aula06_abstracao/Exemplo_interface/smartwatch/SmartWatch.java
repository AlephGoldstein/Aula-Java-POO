package com.senai.aula006_abstracao.Exemplo_interface.smartwatch;

public class SmartWatch implements SensorCardiaco,SensorPassos,SensorSono{
    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medicação cardiaca:80bpm");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Passos hoje: 1458 passos");
    }

    @Override
    public void medirQuantidadePassos() {
        System.out.println("Qualidade do sono: 7h30 sono profundo");

    }
    public void exibirInformacaoDispositivos(){
        System.out.println("Dispositivos conectados: ..........");
    }
}
