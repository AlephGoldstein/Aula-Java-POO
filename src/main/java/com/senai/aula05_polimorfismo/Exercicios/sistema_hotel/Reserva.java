package com.senai.aula05_polimorfismo.Exercicios.sistema_hotel;

import java.util.Date;

public class Reserva {
    private Pessoa pessoa;
    private double valorReserva;
    private Date data_agendameto;

    public Reserva(Pessoa pessoa, double valorReserva, Date data_agendameto) {
        this.pessoa = pessoa;
        this.valorReserva = valorReserva;
        this.data_agendameto = data_agendameto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;
    }

    public Date getData_agendameto() {
        return data_agendameto;
    }

    public void setData_agendameto(Date data_agendameto) {
        this.data_agendameto = data_agendameto;
    }
    public double calcularTodo(double valor){
        return valor;
    }

}
