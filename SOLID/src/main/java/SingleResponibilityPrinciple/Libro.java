package SingleResponibilityPrinciple;

public class Libro implements GestorLibro{
    private PersistenciaLibro persistenciaLibro;
    private Imprimir imprimirLibro;
    private String autor;
    private int paginas;

    public Libro(String autor, int paginas){
        this.autor = autor;
        this.paginas = paginas;
        this.persistenciaLibro = new PersistenciaLibro();
        this.imprimirLibro = new Imprimir();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
//    si quisieramos poder imprimir y gualdar un libro podriamo
//    crear un metodo que se encargue de ambas cosas.

//    public void imprimirYGuardar() {
//        System.out.println("imprimiendo el libro...");
//        System.out.println("guardando el libro...");
//    }

//    pero esto seria una violacion directa al principio de
//    resonsabilidad unica.
//    en vez de ello podriamos separar el metodo imprimirYGuardar
//    de forma que podamos imprimir y guardar como unica
//    responsabilidad

    @Override
    public void imprimir() {
        this.imprimirLibro.imprimir(this);
    }

    @Override
    public void guardar() {
        this.persistenciaLibro.guardar(this);
    }

    @Override
    public String toString() {
        return
                "autor='" + autor + '\'' +
                ", paginas=" + paginas;
    }
}
