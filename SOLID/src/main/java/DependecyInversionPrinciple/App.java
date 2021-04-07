package DependecyInversionPrinciple;

public class App {

    public static void main(String[] args){
        DBHandler dbHandler = new DBHandler(new OracleDatabase());
        dbHandler.Conectar();
        dbHandler.Desconectar();
    }
}

//  de esta forma el DBHandler no sabe sobre la implementacion concreta
//  del tipo de base de datos, solo sabe que va a ser una base de datos
//  de la misma forma MySQL y Oracle no saben sobre DBHandler
