package database.adapter;

import database.adaptee.MySQLDB;

public class MySQLAdapter implements DatabaseAdapter {

    private MySQLDB db = new MySQLDB();

    public void conectar() {
        db.connectMySQL();
    }

    public void salvar(String dado) {
        db.insertMySQL(dado);
    }

    public void ler() {
        db.queryMySQL();
    }
}