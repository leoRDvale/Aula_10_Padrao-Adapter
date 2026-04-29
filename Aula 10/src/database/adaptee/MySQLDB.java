package database.adaptee;

public class MySQLDB {
    public void connectMySQL() {
        System.out.println("MySQL conectado");
    }

    public void insertMySQL(String data) {
        System.out.println("MySQL salvando: " + data);
    }

    public void queryMySQL() {
        System.out.println("MySQL lendo dados");
    }
}