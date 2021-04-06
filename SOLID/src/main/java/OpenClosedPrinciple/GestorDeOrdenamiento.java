package OpenClosedPrinciple;

public class GestorDeOrdenamiento {
    public void ordenamiento(Ordenador ordenador){
        if(ordenador.tipo == TipoSort.INSERTIONSORT)
            ordenarPorInsertion(ordenador);
        else if (ordenador.tipo == TipoSort.MERGESORT)
            ordenarPorMerge(ordenador);
    }

    private void ordenarPorMerge(Ordenador ordenador) {
        ordenador.ordenar();
    }

    private void ordenarPorInsertion(Ordenador ordenador) {
        ordenador.ordenar();
    }
}
