package com.senai.aula_007_mvc.crud_usuario.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SupervisorDAO {
    private List<Supervisor> Supervisor;
    private final String FILE_PATH = "Supervisor.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private List<Supervisor> carregar(){
        try(FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<ArrayList<Supervisor>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            return new ArrayList<>();
        }

    }

    public SupervisorDAO() {
        this.Supervisor = carregar();
    }
    public void salvar(Supervisor supervisor){
        Supervisor.add(supervisor);
        salvarJson();
    }
    public void salvarJson(){
        try(FileWriter writer = new FileWriter(FILE_PATH)){
            gson.toJson(Supervisor,writer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public boolean deletar(int id){
        Iterator<Supervisor> iterator = Supervisor.iterator();
        while(iterator.hasNext()){
            Supervisor o = iterator.next();
            if(o.getId() == id){
                iterator.remove();
                salvarJson();
                return true;
            }
        }
        return false;
    }
    public void listar() {
        if (Supervisor.isEmpty()) {
            System.out.println("Nenhum supervisor encontrado.");
        } else {
            Supervisor.forEach(supervisor -> {
                System.out.println("ID: " + supervisor.getId() + ", Nome: " + supervisor.getNome() + ", Área: " + supervisor.getArea());
            });
        }
    }

    public void atualizar(Supervisor supervisor){
        Supervisor.forEach(o->{
            if (o.getId() == supervisor.getId()){
                o.setNome(supervisor.getNome());
                o.setArea(supervisor.getArea());
                salvarJson();
            }
        });
    }
}
