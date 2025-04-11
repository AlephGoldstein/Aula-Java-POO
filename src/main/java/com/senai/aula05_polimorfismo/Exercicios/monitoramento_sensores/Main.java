package com.senai.aula05_polimorfismo.Exercicios.monitoramento_sensores;

public class Main {


    public static void main(String[] args) {
        Sensor sensor1 = new SensorTemperatura();
        Sensor sensor2 = new SensorUmidade();
        System.out.println(sensor1);
        System.out.println(sensor2);
    }
}
