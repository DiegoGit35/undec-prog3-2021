package DependecyInversionPrinciple;

public class OracleDatabase implements BaseDeDatos{
    @Override
    public void connect() {
        System.out.println("Conectandose con la base de datos Oracle...");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectandose de la base de datos Oracle...");
    }
}
