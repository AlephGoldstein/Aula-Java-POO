package com.senai.aula02_colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Rafael",40);
        Pessoa pessoa2 = new Pessoa("Gislene",32);
        Pessoa pessoa3 = new Pessoa("Lara",6);
        //-------------usando matriz-------------------------------------

        Pessoa[] matrizPessoas = new Pessoa[4];

        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;

        for (Pessoa pessoa : matrizPessoas) {
            System.out.println(pessoa);
        }

        matrizPessoas[0].falar("Oi!!");
        matrizPessoas[3] = new Pessoa("Helena",65);
        System.out.println(matrizPessoas[3].nome);

        //--------------usando ArrayList--------------------------------

        ArrayList lista = new ArrayList();

        lista.add(12);
        lista.add(true);
        lista.add("teste");
        lista.add(pessoa1);

        Pessoa pessoa = (Pessoa) lista.get(3);
        pessoa.falar("teste");

        ArrayList<Pessoa> listaPessoas = new ArrayList();

        listaPessoas.add(pessoa1);
        listaPessoas.add(new Pessoa("José", 20));

        System.out.println("tamanho da lista: "+listaPessoas.size());
        listar(listaPessoas);
        listaPessoas.remove(pessoa1);
        listar(listaPessoas);

        listaPessoas.set(0,pessoa2);
        listar(listaPessoas);

        listaPessoas.add(0,pessoa3);
        listar(listaPessoas);
        listaPessoas.forEach(System.out::println);
        List<Pessoa> listaFiltrada = listaPessoas.stream().filter(p -> p.idade >= 10).toList();
        System.out.println("Lista filtrada");
        listaFiltrada.forEach(System.out::println);
    }

    public static void listar(ArrayList<Pessoa> lista){
        System.out.println("\n--------lista--------");
        for (Pessoa pessoa: lista){
            System.out.println(pessoa);
        }
        System.out.println("---------------------");
    }
}
