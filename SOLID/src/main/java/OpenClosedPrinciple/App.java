package OpenClosedPrinciple;

public class App {
    public static void main(String[] args){
        GestorDeOrdenamiento gestorDeOrdenamiento = new GestorDeOrdenamiento();
//        gestorDeOrdenamiento.ordenamiento(new MergeSort());
        gestorDeOrdenamiento.ordenamiento(new InsertionSort());
    }
}
//  creamos una implemantacion para elegir un tipo de ordenamento
//  pero esta implementacion es muy rigida, si quisieramos añadir un
//  nuevo tipo de ordenamiento tendriamos que MODIFICAR varias clases
//  y metodos
//  intentemos una nueva implementacion...