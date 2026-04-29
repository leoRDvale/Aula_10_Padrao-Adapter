
import domain.PerfilUsuario;
import database.factory.DatabaseFactory;
import database.adapter.DatabaseAdapter;
import service.ClienteService;

public class Main {

    public static void main(String[] args) {

        PerfilUsuario perfil = PerfilUsuario.GRATUITO;

        DatabaseAdapter db = DatabaseFactory.getDatabase(perfil);

        ClienteService service = new ClienteService(db);

        service.cadastrarCliente("Leonard");
        service.listarClientes();
    }

}

//  switch (perfil) {
//            case GRATUITO:
//                return new ParadoxAdapter();
//
//            case BASICO:
//                return new FirebirdAdapter();
//
//            case ULTIMATE:
//                return new MySQLAdapter();