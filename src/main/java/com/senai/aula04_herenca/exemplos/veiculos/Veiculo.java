package com.senai.aula04_herenca.exemplos.veiculos;

public class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(int ano, String marca) {
        this.ano = ano;
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void exibirDetalhes(){
        System.out.print(marca+" "+ano);
    }
}
