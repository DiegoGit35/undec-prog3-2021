package OpenClosedPrinciple;

public class InsertionSort extends Ordenador{
    public InsertionSort(){
        super.tipo = TipoSort.INSERTIONSORT;

    }

    @Override
    protected void ordenar() {
        System.out.println("ordenado por InstertionSort...");
    }
}
