package com.senai.aula_007_mvc.crud_usuario.controller;

import com.senai.aula_007_mvc.crud_usuario.model.OperadorDAO;
import com.senai.aula_007_mvc.crud_usuario.model.Operador;
import java.util.List;

public class OperadorController {
    private OperadorDAO operadorDAO = new OperadorDAO();

    public void listarOperadores() {
        List<Operador> operadores = operadorDAO.listar();
        if (operadores.isEmpty()) {
            System.out.println("Nenhum operador encontrado.");
        } else {
            for (Operador operador : operadores) {
                System.out.println("ID: " + operador.getId() + ", Nome: " + operador.getNome() + ", Setor: " + operador.getSetor());
            }
        }
    }

    public boolean atualizarOperador(Operador operador) {
        if (operador != null && operador.getId() >= 0) {
            operadorDAO.atualizar(operador);
            return true;
        }
        return false;
    }

    public boolean deletarOperador(int id) {
        if (id >= 0) {
            boolean deleted = operadorDAO.deletar(id);
            return deleted;
        }
        return false;
    }

    public boolean cadastrarOperador(Operador operador) {
        if (operador != null) {
            operadorDAO.salvar(operador);
            return true;
        }
        return false;
    }
}
