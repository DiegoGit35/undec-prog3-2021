package InterfaceSegregationPrinciple;

public class Pinguino implements AnimalNadador, AnimalCazador {

    @Override
    public void cazar() {
        System.out.println("preparando para cazar...");
    }

    public void nadar() {
        System.out.println("Preparando para nadar");
    }
}
