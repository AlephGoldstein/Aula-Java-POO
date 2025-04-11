package com.senai.aula006_abstracao.Exemplo_interface.aparelho_eletronico;

public class Televisao implements AparelhoEletronico{
    @Override
    public void ligar() {
        System.out.println("Ligando televisão");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando televisão");
    }
}
