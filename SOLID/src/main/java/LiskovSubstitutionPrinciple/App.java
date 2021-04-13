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


/**
 * Atención a este principio. El objetivo es que el cliente (main en este caso) no deba indagar acerca de qué
 * subtipo esta implementandose. Lo que has hecho, es más ISP que LSP.
 */
