package com.senai.aula05_polimorfismo.Exercicios.sistema_hotel;

import java.util.Date;

public class ReservaSimples extends Reserva{
    public ReservaSimples(Pessoa pessoa, double valorReserva, Date data_agendameto) {
        super(pessoa, valorReserva, data_agendameto);
    }

    @Override
    public double calcularTodo(double valor) {
        return valor*1.2;
    }
}
