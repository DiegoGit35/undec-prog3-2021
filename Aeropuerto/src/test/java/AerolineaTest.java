import exceptions.ExceptionAerolinea;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AerolineaTest {
    GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
    Aerolinea aerolinea = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);

    @Test
    void test01getCuit() throws ExceptionAerolinea {
        assertEquals("30-64140555-4", aerolinea.getCuit());
    }

    @Test
    void test02getCuit() throws ExceptionAerolinea {
        Aerolinea aerolinea = new Aerolinea(null, "ar", "Aerolíneas Argentinas", f1);
    }

    @Test
    void test03setCuit() throws ExceptionAerolinea {
        aerolinea.setCuit("30-64140555-3");
        assertEquals("30-64140555-3", aerolinea.getCuit());
    }

    @Test
    void test04getCodIATA() throws ExceptionAerolinea {
        assertEquals("AR", aerolinea.getCodIATA());
    }

    @Test
    void test06setCodIATA() throws ExceptionAerolinea {
        assertEquals("AS", aerolinea.getCodIATA());
    }

    @Test
    void test07getNombre() throws ExceptionAerolinea {
        assertEquals("Aerolíneas Argentinas", aerolinea.getNombre());
    }

    @Test
    void test08setNombre() throws ExceptionAerolinea {
        aerolinea.setNombre("Alas del Sur");
        assertEquals("Alas Del Sur", aerolinea.getNombre());
    }

    @Test
    void test09getFecha() throws ExceptionAerolinea {
        assertEquals("27/11/1996", aerolinea.getFecha());
    }

    @Test
    void test10SetFecha() throws ExceptionAerolinea {
        aerolinea.setFecha(2019, 9, 11);
        assertEquals("11/10/2019", aerolinea.getFecha());
    }

//    12. Cargar una aerolínea nueva
    @Test
    void test11addAerolinea() throws ExceptionAerolinea {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        GregorianCalendar f2 = new GregorianCalendar(1983, 04, 13);
        Aerolinea aerolinea = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        Aerolinea aerolinea2 = new Aerolinea("30-64142124-2", "CL", "Aerolíneas Argentinas", f2);
        GestorAerolieas ga = new GestorAerolieas();
        assertEquals(0, ga.cantAerolineas());
        ga.addAerolinea(aerolinea);
        assertEquals(1, ga.cantAerolineas());
        ga.addAerolinea(aerolinea);
        ga.addAerolinea(aerolinea2);
        assertEquals(2, ga.cantAerolineas());
    }

//    14. Buscar aerolíneas por nombre
    @Test
    void test12buscarAerolineaxNombre() throws ExceptionAerolinea {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        GregorianCalendar f2 = new GregorianCalendar(1983, 04, 13);
        GregorianCalendar f3 = new GregorianCalendar(2000, 06, 06);
        Aerolinea aerolinea = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        Aerolinea aerolinea2 = new Aerolinea("30-64142124-2", "CL", "Aerolíneas Argentinas", f2);
        Aerolinea aerolinea3 = new Aerolinea("30-64140515-4", "UR", "Aerolíneas Argentinas", f3);
        GestorAerolieas ga = new GestorAerolieas();
        ga.addAerolinea(aerolinea);
        ga.addAerolinea(aerolinea2);
        ga.addAerolinea(aerolinea3);
        List<Aerolinea> lista2 = new ArrayList<Aerolinea>();
        lista2.add(aerolinea);
        assertEquals(lista2, ga.buscarAerolineaXnombre("Aerolíneas Argentinas"));
    }
}