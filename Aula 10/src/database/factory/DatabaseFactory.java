package database.factory;

import database.adapter.DatabaseAdapter;
import database.adapter.FirebirdAdapter;
import database.adapter.MySQLAdapter;
import database.adapter.ParadoxAdapter;
import domain.PerfilUsuario;

public class DatabaseFactory {

    public static DatabaseAdapter getDatabase(PerfilUsuario perfil) {

        switch (perfil) {
            case GRATUITO:
                return new ParadoxAdapter();

            case BASICO:
                return new FirebirdAdapter();

            case ULTIMATE:
                return new MySQLAdapter();

            default:
                throw new IllegalArgumentException("Perfil inválido");
        }
    }
}