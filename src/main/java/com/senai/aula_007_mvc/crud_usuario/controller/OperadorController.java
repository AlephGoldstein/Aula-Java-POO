package com.senai.aula_007_mvc.crud_usuario.controller;

import com.senai.aula_007_mvc.crud_usuario.model.OperadorDAO;
import com.senai.aula_007_mvc.crud_usuario.model.Operador;

public class OperadorController {
    private OperadorDAO operadorDAO = new OperadorDAO();

    public List<Operador> ListarOperadores(){
        return OperadorDAO.listar();
    }
    public boolean atualizarOperador(Operador operador){
        if(operador != null){
            operadorDAO.atualizar(operador);
            return true;
        }
        return false;
    }
    public boolean deletarOperador(int id){
        if(id >= 0){
            operadorDAO.deletar(id);
            return true;
        }
        return false;
    }
}
