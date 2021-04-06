package OpenClosedPrinciple;

public class MergeSort extends Ordenador{

    public MergeSort(){
        super.tipo = TipoSort.MERGESORT;

    }

    @Override
    protected void ordenar() {
        System.out.println("ordenado por MergeSort...");
    }
}
