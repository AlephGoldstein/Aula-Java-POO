package com.senai.aula03_encapsulamento.Exercicio3;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Funcionarios {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionarios(String nome, double salario, String cargo, ArrayList cargos_possiveis) {
        setNome(nome);
        setSalario(salario);
        setCargo(cargo,cargos_possiveis);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }

    }

    public void setSalario(double salario) {
        if(salario > 1.320){
            this.salario = salario;
        }else{
            System.out.println("O salario deve ser maior que R$1.320,00");
            System.out.println("O campo será preenchido com R$1.320,00");
            this.salario = 1320;
        }

    }

    public void setCargo(String cargo,ArrayList cargos_possiveis) {
        if(cargos_possiveis.contains(cargo)){
            this.cargo = cargo;
        }else{
            throw new IllegalArgumentException("Cargo invalido");
        }

    }
    public void aumentarSalario(double salarioini, double salarioAumentado){
        System.out.println("O percentual de aumento é de " + (salarioAumentado * 100) / salarioini + "%");
        setSalario(salarioini + salarioAumentado);

    }

}
