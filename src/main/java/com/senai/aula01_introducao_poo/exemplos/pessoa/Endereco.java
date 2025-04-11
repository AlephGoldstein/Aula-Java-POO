package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Endereco {
    public String rua;
    public String bairro;
    public int numeroCasa;
    public String Cidade;

    public Endereco(String bairro, String rua, int numeroCasa, String cidade) {
        this.bairro = bairro;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        Cidade = cidade;
    }

    public void EnderecoCompleto(){
        System.out.println(rua+" "+numeroCasa+" "+bairro+ " "+Cidade);
    }

    @Override
    public String toString() {
        return "Endereco:" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numeroCasa=" + numeroCasa +
                ", Cidade='" + Cidade + '\'' +
                " \t";
    }
}
