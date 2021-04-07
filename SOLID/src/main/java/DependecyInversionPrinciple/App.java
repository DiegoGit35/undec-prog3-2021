package DependecyInversionPrinciple;

public class App {

    public static void main(String[] args){
        DBHandler dbHandler = new DBHandler();
        dbHandler.Conectar();
        dbHandler.Desconectar();
    }
}

//  esta implementacion de conexion con un base de datos es muy rigida
//  el DBHandler es una clase de alto nivel atada a la implementacion
//  de MySQL, por lo que si queremos cambiar de base de datos deberiamos
//  hacer muchos cambios en el codigo
//  el DBHandler no deberia saber sobre la base de datos MySQL, por lo
//  que deberiamos crear una abstraccion que se encargue de invertir esa
//  dependencia
