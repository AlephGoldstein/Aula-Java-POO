package com.senai.aula05_polimorfismo.Exercicios.sistema_hotel;

import java.util.Date;

public class ReservaVip extends Reserva{
    public ReservaVip(Pessoa pessoa, double valorReserva, Date data_agendameto) {
        super(pessoa, valorReserva, data_agendameto);
    }

    @Override
    public double calcularTodo(double valor) {
        return valor*5;
    }
}
