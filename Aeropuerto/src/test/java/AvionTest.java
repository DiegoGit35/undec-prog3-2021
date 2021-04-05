import exceptions.ExceptionAvion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AvionTest {
    Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
    @Test
    void test01GetMatricula() throws ExceptionAvion {
        Assertions.assertNotEquals("LV-AAB", a.getMatricula());
    }

    @Test
    void test02GetMatricula() throws ExceptionAvion {
        Assertions.assertEquals("LV-AAA", a.getMatricula());
    }

    @Test
    void test03setMatricula() throws ExceptionAvion {
        a.setMatricula("LV-BBB");
        Assertions.assertEquals("LV-BBB", a.getMatricula());
    }

    @Test
    void test05getModelo() throws ExceptionAvion {
        Assertions.assertEquals("modelo1", a.getModelo());
    }

    @Test
    void test06setModelo() throws ExceptionAvion {
        a.setModelo("modelo2");
        Assertions.assertEquals("modelo2", a.getModelo());
    }

    @Test
    void test07getCapacidad() throws ExceptionAvion {
        Assertions.assertEquals(120, a.getCapacidad());
    }

    @Test
    void test08setCapacidad() throws ExceptionAvion {
        a.setCapacidad(100);
        Assertions.assertEquals(100, a.getCapacidad());
    }

    @Test
    void test09getAnioFab() throws ExceptionAvion {
        Assertions.assertEquals(2010, a.getAnioFab());
    }

    @Test
    void test10setAnioFab() throws ExceptionAvion {
        a.setAnioFab(2012);
        Assertions.assertEquals(2012, a.getAnioFab());
    }

    @Test
    void test11setAnioFab() throws ExceptionAvion {
        a.setAnioFab(-3012);
        Assertions.assertEquals(2010, a.getAnioFab());
    }

    @Test
    void test12AddAvion() throws ExceptionAvion {
        Aerolinea al = new Aerolinea();
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        Avion a2 = new Avion("LV-AAB", "modelo2", 150, 2010);
        Avion a3 = new Avion("LV-AAC", "modelo5", 100, 2010);
        Avion a4 = new Avion("LQ-AAA", "modelo6", 80, 2010);
        al.addAvion(a);
        al.addAvion(a2);
        al.addAvion(a3);
        al.addAvion(a4);
        al.addAvion(a);
        al.addAvion(a2);
        Assertions.assertEquals(4, al.cantAviones());
    }

    @Test
    void test13BuscarAvion() throws ExceptionAvion {
        Aerolinea al = new Aerolinea();
        List<Avion> l1 = new ArrayList();
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        Avion a2 = new Avion("LV-AAB", "modelo2", 150, 2010);
        Avion a3 = new Avion("LV-ABC", "modelo5", 100, 2010);
        Avion a4 = new Avion("LQ-AAA", "modelo6", 80, 2010);
        al.addAvion(a);
        al.addAvion(a2);
        al.addAvion(a3);
        al.addAvion(a4);
        l1.add(a);
        Assertions.assertEquals(l1, al.buscarAvionesxMatriculas("LV-AAA"));
        l1.add(a2);
        Assertions.assertEquals(l1, al.buscarAvionesxMatriculas("LV-AA"));
    }
}
