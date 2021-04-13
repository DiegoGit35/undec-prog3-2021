package InterfaceSegregationPrinciple;



public class App {
    public static void main(String[] args){
        Aguila aguila = new Aguila();
        Pinguino pinguino = new Pinguino();
        aguila.cazar();
        pinguino.nadar();
        aguila.volar();
        pinguino.cazar();
    }
}

//  la solucion a este problema fue dividir una interface con varios metodos
//  en varias interfaces con metodos menos metodos. asi logramos que las
//  implementaciones de interfaces sean mas adecuadas

/**
 * Bien aplicado el principio aqui.
 */
