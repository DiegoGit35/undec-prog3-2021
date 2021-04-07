package DependecyInversionPrinciple;

public class DBHandler {
    private BaseDeDatos baseDeDatos;

    public DBHandler(BaseDeDatos baseDeDatos){
        this.baseDeDatos = new MySQLDatabase();
    }

    public void Conectar(){
        baseDeDatos.connect();
    }
    public void Desconectar(){
        baseDeDatos.disconnect();
    }
}
