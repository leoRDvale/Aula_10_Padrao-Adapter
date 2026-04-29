package database.adapter;

public interface DatabaseAdapter {
    void conectar();
    void salvar(String dado);
    void ler();
}