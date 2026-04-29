package database.adaptee;

public class FirebirdDB {
    public void connectFirebird() {
        System.out.println("Firebird conectado");
    }

    public void saveFirebird(String data) {
        System.out.println("Firebird salvando: " + data);
    }

    public void readFirebird() {
        System.out.println("Firebird lendo dados");
    }
}