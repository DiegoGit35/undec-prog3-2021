import exceptions.ExceptionPiloto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PilotoTest {
    Aerolinea aerolinea = new Aerolinea();
    GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
    GregorianCalendar f2 = new GregorianCalendar(1983, 04, 13);
    GregorianCalendar f3 = new GregorianCalendar(2000, 06, 06);
    List<Piloto> listaPilotos = new ArrayList<Piloto>();
    Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "Diego", f1, RolTripulacion.PILOTO);
    Piloto p2 = new Piloto("30-64140341-2", 1234312, "perez", "jose", f2, RolTripulacion.PILOTO);
    Piloto p3 = new Piloto("30-64149492-3", 1234353, "jimenez", "pedro", f3, RolTripulacion.COPILOTO);
    Piloto p4 = new Piloto("30-64134595-3", 1234353, "perez", "pedro", f3, RolTripulacion.COPILOTO);

//  Cargar un piloto nuevo
    @Test
    void test01addPiloto() throws ExceptionPiloto{
        aerolinea.addPiloto(p);
        aerolinea.addPiloto(p2);
        aerolinea.addPiloto(p3);
        assertEquals(3, aerolinea.cantPilotos());
    }

//  Consultar pilotos
    @Test
    void test02getPilotos() throws ExceptionPiloto {
        aerolinea.addPiloto(p);
        aerolinea.addPiloto(p2);
        aerolinea.addPiloto(p3);
        listaPilotos.add(p);
        listaPilotos.add(p2);
        listaPilotos.add(p3);
        assertEquals(listaPilotos, aerolinea.getPilotos());
    }

//  Buscar un piloto por cuil
    @Test
    void test03buscarPilotoxCuil() throws ExceptionPiloto {
        aerolinea.addPiloto(p);
        aerolinea.addPiloto(p2);
        aerolinea.addPiloto(p3);
        listaPilotos.add(p3);
        assertEquals(listaPilotos, aerolinea.buscarPilotoxCuil("30-64149492-3"));
    }

//  Buscar pilotos por apellido
    @Test
    void test04buscarPilotoxApellido() throws ExceptionPiloto {
        aerolinea.addPiloto(p);
        aerolinea.addPiloto(p2);
        aerolinea.addPiloto(p3);
        aerolinea.addPiloto(p4);
        listaPilotos.add(p2);
        listaPilotos.add(p4);
        assertEquals(listaPilotos, aerolinea.buscarPilotoxApellido("perez"));
    }
}