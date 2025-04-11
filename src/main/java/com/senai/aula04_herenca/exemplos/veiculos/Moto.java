package com.senai.aula04_herenca.exemplos.veiculos;

public class Moto extends Veiculo {
    private boolean partidaeletrica;

    public Moto(int ano, String marca, boolean partidaeletrica) {
        super(ano, marca);
        this.partidaeletrica = partidaeletrica;
    }

    public boolean isPartidaeletrica() {
        return partidaeletrica;
    }

    public void setPartidaeletrica(boolean partidaeletrica) {
        this.partidaeletrica = partidaeletrica;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}
