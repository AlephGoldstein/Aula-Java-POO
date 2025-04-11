package com.senai.aula04_herenca.exemplos.gerenciamentocadastrofunc.funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Rafael", 2100);
        Gerente gerente1 = new Gerente("Tercio",7500,550);
        gerente1.exibirInformacoes();
        funcionario1.exibirInformacoes();
    }
}
