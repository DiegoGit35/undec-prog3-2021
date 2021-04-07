package InterfaceSegregationPrinciple;

public class Pinguino implements Ave{
    @Override
    public void volar() {
        System.out.println("el piinguino es demasido pesado para volar... Vuelo cancelado");
    }

    @Override
    public void cazar() {
        System.out.println("preparando para cazar...");
    }

    public void nadar() {
        System.out.println("Preparando para nadar");
    }
}
