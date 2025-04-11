package com.senai.aula05_polimorfismo.Exemplos.sistema_de_pagamentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamentos> listaPagamentos = new ArrayList<>();

        listaPagamentos.add(new CLT("Toninho",1500));
        listaPagamentos.add(new PJ("Giselle",25, 100));
        listaPagamentos.add(new Freelancer("Brailes",15000));

        listaPagamentos.forEach(pagamentos -> System.out.printf("%s recebe R$%,.2f de salário \n",pagamentos.getNome(),pagamentos.calcularPagamentos()));
    }
}
