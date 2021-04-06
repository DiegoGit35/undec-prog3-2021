package OpenClosedPrinciple;

public class App {
    public static void main(String[] args){
        GestorDeOrdenamiento gestorDeOrdenamiento = new GestorDeOrdenamiento();
//        gestorDeOrdenamiento.ordenamiento(new MergeSort());
        gestorDeOrdenamiento.ordenamiento(new InsertionSort());
    }
}
//    en esta nueva implementacion no queremos usar ningun enum de ordenamientos,
//    Ordenador ya no va a ser una clase abstracta sino una interface,
//    en instertion sort no hace falta especificar el tipo, igual para
//    mergesort, sin embargo el mayor cambio se hace en la clase Gestor
//    de ordenamiento en donde ya no necesitamos varios metodos ni preguntar
//    que tipo de ordenamiento tenemos, sino que simplemente llamamos al
//    metodo ordenar, independientemente del tipo de ordenamiento que sea.

//    con esta nueva implementacion podemos añadir nuevos tipos de ordenamientos
//    sin necesidad de modificar el codigo