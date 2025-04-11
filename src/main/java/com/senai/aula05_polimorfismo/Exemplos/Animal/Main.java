package com.senai.aula05_polimorfismo.Exemplos.Animal;

public class Main {
    public static void main(String[] args) {
        testarSomAnimal(new Cachorro());
    }
    public static void testarSomAnimal(Animal animal){
        animal.fazerSom();
    }

}
