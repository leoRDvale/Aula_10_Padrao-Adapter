package database.adapter;

import database.adaptee.ParadoxDB;

public class ParadoxAdapter implements DatabaseAdapter {

    private ParadoxDB db = new ParadoxDB();

    public void conectar() {
        db.open();
    }

    public void salvar(String dado) {
        db.insert(dado);
    }

    public void ler() {
        db.fetch();
    }
}