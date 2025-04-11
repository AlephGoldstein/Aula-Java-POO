package com.senai;

import com.senai.aula01_introducao_poo.exemplos.pessoa.Endereco;
import com.senai.aula01_introducao_poo.exemplos.pessoa.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa(
                new Endereco("Grajau",
                             "grauna do baile",
                             12,
                             "Sp"),
                             1.8f,
                             12,
                             "Allan");
        pessoa1.comer("Pão");
        System.out.println(pessoa1);
        pessoa1.falar("dale");
        Pessoa pessoa2 = new Pessoa(
                new Endereco("Grajau",
                        "grauna do baile",
                        12,
                        "Sp"),
                1.8f,
                12,
                "Allan");
        String[] etiqueta = {"Nome","Idade","Altura","Endereço\n","Rua","Logradouro","Cidade","numeroCasa","bairro"};
        String[] dados = new String[etiqueta.length];
        System.out.println("Preencha os dados da pessoa criada");
        for (int i = 0; i < etiqueta.length; i++) {
            System.out.println(etiqueta[i]);
            dados[i] = scanner.nextLine();
        }

    }


}
