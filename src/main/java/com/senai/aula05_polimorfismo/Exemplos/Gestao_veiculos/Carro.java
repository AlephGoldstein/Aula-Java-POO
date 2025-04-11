package com.senai.aula05_polimorfismo.Exemplos.Gestao_veiculos;

public class Carro extends Veiculo{
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção realizada com sucesso em carro");
    }
}
