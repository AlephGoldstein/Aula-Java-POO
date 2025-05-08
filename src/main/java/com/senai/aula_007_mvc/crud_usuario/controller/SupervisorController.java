package com.senai.aula_007_mvc.crud_usuario.controller;

import com.senai.aula_007_mvc.crud_usuario.model.Supervisor;
import com.senai.aula_007_mvc.crud_usuario.model.SupervisorDAO;

public class SupervisorController {
    private SupervisorDAO supervisorDAO = new SupervisorDAO();


    public void listarSupervisores() {
        supervisorDAO.listar();
    }


    public boolean atualizarSupervisor(Supervisor supervisor) {
        if (supervisor != null && supervisor.getId() > 0) {
            supervisorDAO.atualizar(supervisor);
            System.out.println("Supervisor atualizado com sucesso!");
            return true;
        } else {
            System.out.println("Erro: Supervisor inválido ou ID não encontrado.");
            return false;
        }
    }
    public boolean deletarSupervisor(int id) {
        if (id > 0) {
            boolean sucesso = supervisorDAO.deletar(id);
            if (sucesso) {
                System.out.println("Supervisor deletado com sucesso.");
            } else {
                System.out.println("Supervisor com ID " + id + " não encontrado.");
            }
            return sucesso;
        } else {
            System.out.println("ID inválido.");
            return false;
        }
    }


    public boolean cadastrarSupervisor(Supervisor supervisor) {
        if (supervisor != null && supervisor.getId() > 0 && supervisor.getNome() != null && !supervisor.getNome().isEmpty()) {
            supervisorDAO.salvar(supervisor);
            System.out.println("Supervisor cadastrado com sucesso!");
            return true;
        } else {
            System.out.println("Erro ao cadastrar supervisor. Verifique os dados fornecidos.");
            return false;
        }
    }
}
