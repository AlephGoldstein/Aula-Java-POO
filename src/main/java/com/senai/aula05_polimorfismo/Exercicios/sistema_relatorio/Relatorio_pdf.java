package com.senai.aula05_polimorfismo.Exercicios.sistema_relatorio;

public class Relatorio_pdf extends Relatorio{
    @Override
    public void gerar() {
        System.out.println("Um relatório em pdf");
    }
}
