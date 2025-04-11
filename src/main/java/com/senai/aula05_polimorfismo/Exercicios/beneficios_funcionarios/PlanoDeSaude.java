package com.senai.aula05_polimorfismo.Exercicios.beneficios_funcionarios;

public class PlanoDeSaude extends Beneficio {
    private String nomeConvenio;

    public PlanoDeSaude(float desconto, String nomeConvenio) {
        super(desconto);
        this.nomeConvenio = nomeConvenio;
    }
}
