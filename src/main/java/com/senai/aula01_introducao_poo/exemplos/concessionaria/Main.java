package com.senai.aula01_introducao_poo.exemplos.concessionaria;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(2021,"Hyundai","HB20","azul",1.4f,200.00f,150,"Jorge",false);
        Carro carro2 = new Carro(1990, "Volkswagen","Fusca", "Verde",1.0f,15.00f,500,"Alloene",false);
        System.out.println(carro1);
        System.out.println(carro2);
        carro1.testDrive();
        carro2.testDrive();
        carro1.comprar("Allan");
        carro2.comprar("Bruno");
        carro1.valorFipe(2025);

    }
}
