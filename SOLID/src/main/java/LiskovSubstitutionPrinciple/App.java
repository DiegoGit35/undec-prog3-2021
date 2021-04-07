package LiskovSubstitutionPrinciple;

public class App {
    public static void main(String[] args){
        Vehiculo auto = new AutoElectrico();
        if(auto instanceof AutoElectrico)
            System.out.println("No se puede cargar combustible en un auto electrico");
        else
            auto.cargarCombustible();
    }
}
// esta implementaccion no es buena porque no podemos utilizar los metodos de
// Vehiculo apropiadamente cuando se trata de un auto electrico, y si aplicamos
// el principio de substitucion de liskov deberiamos poder usar un auto electrico
// como un vehiculo