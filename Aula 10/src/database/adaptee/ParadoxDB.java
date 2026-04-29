package database.adaptee;

public class ParadoxDB {
    public void open() {
        System.out.println("Paradox conectado");
    }

    public void insert(String data) {
        System.out.println("Paradox salvando: " + data);
    }

    public void fetch() {
        System.out.println("Paradox lendo dados");
    }
}