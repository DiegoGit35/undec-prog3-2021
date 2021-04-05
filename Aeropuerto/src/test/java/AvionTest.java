import exceptions.ExceptionAvion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AvionTest {
    Aerolinea aerolinea = new Aerolinea();
    Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
    Avion a2 = new Avion("LV-AAB", "modelo2", 150, 2010);
    Avion a3 = new Avion("LV-AAC", "modelo5", 100, 2010);
    Avion a4 = new Avion("LQ-AAA", "modelo6", 80, 2010);

    @Test
    void test01AddAvion() throws ExceptionAvion {
        aerolinea.addAvion(a);
        aerolinea.addAvion(a2);
        aerolinea.addAvion(a3);
        aerolinea.addAvion(a4);
        aerolinea.addAvion(a);
        aerolinea.addAvion(a2);
        Assertions.assertEquals(4, aerolinea.cantAviones());
    }

    @Test
    void test02BuscarAvion() throws ExceptionAvion {
        List<Avion> l1 = new ArrayList();
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        Avion a2 = new Avion("LV-AAB", "modelo2", 150, 2010);
        Avion a3 = new Avion("LV-ABC", "modelo5", 100, 2010);
        Avion a4 = new Avion("LQ-AAA", "modelo6", 80, 2010);
        aerolinea.addAvion(a);
        aerolinea.addAvion(a2);
        aerolinea.addAvion(a3);
        aerolinea.addAvion(a4);
        l1.add(a);
        Assertions.assertEquals(l1, aerolinea.buscarAvionesxMatriculas("LV-AAA"));
        l1.add(a2);
        Assertions.assertEquals(l1, aerolinea.buscarAvionesxMatriculas("LV-AA"));
    }
}
