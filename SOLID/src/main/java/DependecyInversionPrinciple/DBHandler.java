package DependecyInversionPrinciple;

public class DBHandler {
    private MySQLDatabase mySQLDatabase;
    public DBHandler(){
        this.mySQLDatabase = new MySQLDatabase();
    }

    public void Conectar(){
        mySQLDatabase.connect();
    }
    public void Desconectar(){
        mySQLDatabase.disconnect();
    }
}
