package com.senai.aula05_polimorfismo.Exemplos.Gestao_veiculos;

public class Moto extends Veiculo{
    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção realizada com sucesso em moto");
    }
}
