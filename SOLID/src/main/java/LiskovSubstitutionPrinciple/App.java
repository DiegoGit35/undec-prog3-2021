package LiskovSubstitutionPrinciple;

public class App {
    public static void main(String[] args){
        VehiculoElectrico auto = new AutoElectrico();
        auto.cargarBaterias();
    }
}
//  la solucion para poder usar un auto electrico
//  con todas las propiedades de una interface es
//  crear nuevas interfaces, de esta forma podemos
//  usar por ejemplo una instancia de un auto electrico
//  como si fuera su clase padre