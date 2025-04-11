package com.senai.aula05_polimorfismo.Exemplos;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(5,7);
        calculadora.somar(7,8,9);
        calculadora.somar(7.5,8.6);
        calculadora.somar(4.2,3.6,7.8);
    }
}
