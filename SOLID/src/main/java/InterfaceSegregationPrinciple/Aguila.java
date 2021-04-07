package InterfaceSegregationPrinciple;

public class Aguila implements Ave{
    @Override
    public void volar() {
        System.out.println("Preparando para volar...");
    }

    @Override
    public void cazar() {
        System.out.println("Preparando para cazar...");
    }
}
