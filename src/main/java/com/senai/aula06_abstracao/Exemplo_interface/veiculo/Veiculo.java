package com.senai.aula006_abstracao.Exemplo_interface.veiculo;

public interface Veiculo {
    void acelerar();

    default void buzinar(){
        System.out.println("BI BI BI");
    }
}
