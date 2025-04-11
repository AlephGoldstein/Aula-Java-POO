package com.senai.aula01_introducao_poo.exercicios.Exercicio1;

public class Produto {
    String nome;
    float preco;
    int quantidade;

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){
        System.out.println("Produto "+nome+" custa "+preco+" e possui "+quantidade+ " itens");
    }
    public void atualizaEstoque (boolean incremento, int valor){
        if(incremento){
            quantidade += valor;
        }else{
            quantidade -= valor;
        }
        System.out.println("Agora possui o produto "+nome+" possui "+quantidade+ " itens");
    }
    public void calcularValorEstoque(){
        float sum = (float) preco * quantidade;
        System.out.println(sum);
    }
}
