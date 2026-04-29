package service;

import database.adapter.DatabaseAdapter;

public class ClienteService {

    private DatabaseAdapter db;

    public ClienteService(DatabaseAdapter db) {
        this.db = db;
    }

    public void cadastrarCliente(String nome) {
        db.conectar();
        db.salvar(nome);
    }

    public void listarClientes() {
        db.ler();
    }
}