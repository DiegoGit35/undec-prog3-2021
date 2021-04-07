package DependecyInversionPrinciple;

public class MySQLDatabase implements BaseDeDatos{
    @Override
    public void connect(){
        System.out.println("Conectandose con la base de datos MySQL...");
    }
    @Override
    public void disconnect(){
        System.out.println("Desconectandose de la base de datos MySQL...");
    }
}
