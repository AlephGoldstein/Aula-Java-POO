package com.senai.aula04_herenca.exercicios.controle_estoque;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Alimento batata = new Alimento("batata",15.0,15,new Date("12/12/2020"));
        Eletronico celular = new Eletronico("s23",2700.00,45,5);
        System.out.println(batata.getData_validade());
    }

}
