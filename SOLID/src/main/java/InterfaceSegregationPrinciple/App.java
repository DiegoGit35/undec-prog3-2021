package InterfaceSegregationPrinciple;



public class App {
    public static void main(String[] args){
        Ave aguila = new Aguila();
        Ave pinguino = new Pinguino();
        aguila.cazar();
        pinguino.volar();
    }
}

//  en este ejemplo las clases aguila y pinguino implementa una interfaz en comun,
//  pero esta interfaz contiene metodos que no se adaptan muy bien a los distintos
//  necesidades de los implementarios