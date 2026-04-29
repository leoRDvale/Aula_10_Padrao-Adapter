package database.adapter;

import database.adaptee.FirebirdDB;

public class FirebirdAdapter implements DatabaseAdapter {

    private FirebirdDB db = new FirebirdDB();

    public void conectar() {
        db.connectFirebird();
    }

    public void salvar(String dado) {
        db.saveFirebird(dado);
    }

    public void ler() {
        db.readFirebird();
    }
}