package com.senai.aula_007_mvc.crud_usuario.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class OperadorDAO {
    private List<Operador> operadores;
    private final String FILE_PATH = "operadores.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private List<Operador> carregar() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<ArrayList<Operador>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.err.println("Erro ao carregar dados do arquivo: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public OperadorDAO() {
        this.operadores = carregar();
    }


    public void salvar(Operador operador) {
        operadores.add(operador);
        salvarJson();
    }


    public void salvarJson() {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(operadores, writer);
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados no arquivo: " + e.getMessage());
        }
    }

    public boolean deletar(int id) {
        boolean encontrado = operadores.removeIf(o -> o.getId() == id);
        if (encontrado) {
            salvarJson();
            System.out.println("Operador com ID " + id + " deletado com sucesso.");
        } else {
            System.out.println("Operador com ID " + id + " não encontrado.");
        }
        return encontrado;
    }

    public List<Operador> listar() {
        if (operadores.isEmpty()) {
            System.out.println("Nenhum operador encontrado.");
        } else {
            operadores.forEach(operador -> {
                System.out.println("ID: " + operador.getId() + ", Nome: " + operador.getNome() + ", Setor: " + operador.getSetor());
            });
        }
        return operadores;
    }

    public void atualizar(Operador operador) {
        boolean atualizado = false;
        for (Operador o : operadores) {
            if (o.getId() == operador.getId()) {
                o.setNome(operador.getNome());
                o.setSetor(operador.getSetor());
                atualizado = true;
                break;
            }
        }
        if (atualizado) {
            salvarJson();
        } else {
            System.out.println("Operador com ID " + operador.getId() + " não encontrado.");
        }
    }
}
