package InterfaceSegregationPrinciple;

public class Aguila implements AnimalVolador,AnimalCazador {
    public void volar() {
        System.out.println("Preparando para volar...");
    }

    public void cazar() {
        System.out.println("Preparando para cazar...");
    }
}
