package LiskovSubstitutionPrinciple;

public class AutoElectrico implements VehiculoElectrico{

    @Override
    public void acelerar() {
        System.out.println("Acelerando el auto eletrico...");
    }

    @Override
    public void cargarBaterias() {
        System.out.println("Cargando baterías...");
    }
}
