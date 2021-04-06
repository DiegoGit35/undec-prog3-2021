import exceptions.ExceptionAerolinea;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AerolineaTest {
    GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
    GregorianCalendar f2 = new GregorianCalendar(1983, 04, 13);
    GregorianCalendar f3 = new GregorianCalendar(2000, 06, 06);
    Aerolinea aerolinea = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
    Aerolinea aerolinea2 = new Aerolinea("30-64142124-2", "CL", "Aerolíneas Chile", f2);
    Aerolinea aerolinea3 = new Aerolinea("30-64140515-4", "UR", "Aerolíneas Uruguay", f3);

//  Cargar una aerolínea nueva
    @Test
    void test01addAerolinea() throws ExceptionAerolinea {
        GestorAerolieas gestorAerolinea = new GestorAerolieas();
        assertEquals(0, gestorAerolinea.cantAerolineas());
        gestorAerolinea.addAerolinea(aerolinea);
        assertEquals(1, gestorAerolinea.cantAerolineas());
        gestorAerolinea.addAerolinea(aerolinea);
        gestorAerolinea.addAerolinea(aerolinea2);
        assertEquals(2, gestorAerolinea.cantAerolineas());
    }

//  Buscar aerolíneas por nombre
    @Test
    void test02buscarAerolineaxNombre() throws ExceptionAerolinea {
        GestorAerolieas gestorAerolinea = new GestorAerolieas();
        gestorAerolinea.addAerolinea(aerolinea);
        gestorAerolinea.addAerolinea(aerolinea2);
        gestorAerolinea.addAerolinea(aerolinea3);
        List<Aerolinea> lista2 = new ArrayList<>();
        lista2.add(aerolinea);
        assertEquals(lista2, gestorAerolinea.buscarAerolineaXnombre("Aerolíneas Argentinas"));
    }
//  Modificar aerolinea
}