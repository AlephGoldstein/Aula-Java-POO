package com.senai.aula05_polimorfismo.Exemplos;

public class Calculadora {
    int somar(int a, int b){
        System.out.println("int int");
        return a+b;
    }
    int somar(int a, int b, int c){
        System.out.println("int int");
        return a+b+c;
    }
    double somar(double y, double x, double c){
        System.out.println("int int");
        return y+x;
    }
    double somar(double a, double b){
        System.out.println("int int");
        return a+b;
    }
}
