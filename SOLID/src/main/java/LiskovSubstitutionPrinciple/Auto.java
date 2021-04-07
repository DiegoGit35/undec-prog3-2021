package LiskovSubstitutionPrinciple;

public class Auto implements Vehiculo{

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void cargarCombustible() {
        System.out.println("Cargando combustile...");
    }
}
