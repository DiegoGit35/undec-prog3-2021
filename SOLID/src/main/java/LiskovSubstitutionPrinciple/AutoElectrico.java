package LiskovSubstitutionPrinciple;

public class AutoElectrico implements Vehiculo{

    @Override
    public void acelerar() {
        System.out.println("Acelerando el auto eletrico...");
    }

    @Override
    public void cargarCombustible() {
//        throw exception
    }
}
