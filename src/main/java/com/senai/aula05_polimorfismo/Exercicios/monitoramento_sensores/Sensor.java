package com.senai.aula05_polimorfismo.Exercicios.monitoramento_sensores;

public class Sensor {
    private String tipo;
    private String consumoEnergia;
    private String unidadeMedida;
    private float versaoFirware;

    public Sensor(String tipo, String consumoEnergia, String unidadeMedida, float versaoFirware) {
        this.tipo = tipo;
        this.consumoEnergia = consumoEnergia;
        this.unidadeMedida = unidadeMedida;
        this.versaoFirware = versaoFirware;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "tipo='" + tipo + '\'' +
                ", consumoEnergia=" + consumoEnergia +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                ", versaoFirware=" + versaoFirware +
                '}';
    }
}
