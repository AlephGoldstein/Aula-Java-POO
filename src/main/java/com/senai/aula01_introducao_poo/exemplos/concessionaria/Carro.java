package com.senai.aula01_introducao_poo.exemplos.concessionaria;

public class Carro {
    String marca;
    int ano;
    String modelo;
    String cor;
    float motor;
    float preco;
    float kilometragem;
    String NomeDono;
    boolean Eletrico;

    public Carro(int ano, String marca, String modelo, String cor, float motor, float preco, float kilometragem, String nomeDono, boolean eletrico) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.preco = preco;
        this.kilometragem = kilometragem;
        NomeDono = nomeDono;
        Eletrico = eletrico;
    }
    public void testDrive(){
        System.out.println("Veiculo "+modelo+ " foi testado e aprovado");
    }
    public void comprar(String nomeCliente){
        System.out.println("Parabéns pela compra "+nomeCliente+ " do "+marca+" "+modelo);
    }
    public void valorFipe(int ano){
        int idade = ano - this.ano;
        double valorAtual = preco;
        for (int i = 0; i < idade; i++) {
            valorAtual = valorAtual - 0.02f*valorAtual;
        }
        float valorAtual2 = (float) ( preco * Math.pow(1- 0.02f,idade));
        System.out.println("Valor atual 2: "+valorAtual2);
        System.out.printf("O modelo %s do ano %d R$%,.2f", modelo,ano, valorAtual);
    }
    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", ano=" + ano +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", motor=" + motor +
                ", preco=" + preco +
                ", kilometragem=" + kilometragem +
                ", NomeDono='" + NomeDono + '\'' +
                ", Eletrico=" + Eletrico +
                '}';
    }
}
