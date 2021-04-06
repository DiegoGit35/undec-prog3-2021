import exceptions.*;
import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VueloTest {
    GregorianCalendar fPiloto = new GregorianCalendar(1996, 11, 27);
    GregorianCalendar fCopiloto = new GregorianCalendar(1996, 11, 27);
    GregorianCalendar fAerolinea = new GregorianCalendar(1996, 11, 27);
    GregorianCalendar hSalida = new GregorianCalendar(2020, 05, 20, 8, 30);
    GregorianCalendar hLlegada = new GregorianCalendar(2020, 05, 20, 10, 30 );
    Piloto piloto = new Piloto("30-64140555-4", 1234321, "estrada", "diego", fPiloto,RolTripulacion.PILOTO);
    Piloto copiloto = new Piloto("30-64140555-4", 1234321, "perez", "juan", fCopiloto, RolTripulacion.COPILOTO);
    List<Piloto> listaPilotos = new ArrayList<Piloto>();
    Aeropuerto apSalida = new Aeropuerto("MDZ", "Mendoza", "El Plumerillo", 4360);
    Aeropuerto apDestino = new Aeropuerto("EZE", "Ezeiza", "Ezeiza", 5360);
    Aerolinea aerolinea = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", fAerolinea);
    Aerolinea aerolinea2 = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", fAerolinea);
    Aerolinea aerolinea3 = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", fAerolinea);
    Avion avion1 = new Avion("LV-AAA", "modelo1", 120, 2010);

    VueloTest() throws ExceptionPiloto, ExceptionAvion, ExceptionAeropuerto, ExceptionAerolinea {
    }

    @Test
    void test01getCodVuelo() throws ExceptionVuelo {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        assertEquals("AR 0001", vuelo.getCodVuelo());
        Vuelo vuelo2 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        assertEquals("AR 0002", vuelo2.getCodVuelo());
        vuelo.clearCodVuelo();
    }

    @Test
    void test02getHoraSalida() throws ExceptionVuelo {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        assertEquals("08:30", vuelo.getHoraSalida());
        vuelo.clearCodVuelo();
    }
//  Cambiar fechas del vuelo (reprogramar)
    @Test
    void test03setSalida() throws ExceptionVuelo {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        vuelo.setHoraSalida(2020, 05, 20, 9, 30);
        assertEquals("09:30", vuelo.getHoraSalida());
        vuelo.clearCodVuelo();
    }

    @Test
    void test04getArribo() throws ExceptionVuelo {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        assertEquals("10:30", vuelo.getHoraArribo());
        vuelo.clearCodVuelo();
    }

    @Test
    void test05setArribo() throws ExceptionVuelo {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        vuelo.setHoraArribo(2020, 05, 20, 11, 30);
        assertEquals("11:30", vuelo.getHoraArribo());
        vuelo.clearCodVuelo();
    }

    @Test
    void test06getAeropuertoSal() throws ExceptionVuelo {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        assertEquals(apSalida, vuelo.getAeropuertoSalida());
        vuelo.clearCodVuelo();
    }

    @Test
    void test07setAeropuertoSal() throws ExceptionVuelo, ExceptionAeropuerto {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        Aeropuerto apSalida2 = new Aeropuerto("IRJ", "La Rioja", "La Rioja", 4360);
        vuelo.setAeropuertoSalida(apSalida2);
        assertSame(apSalida2, vuelo.getAeropuertoSalida());
        vuelo.clearCodVuelo();
    }

    @Test
    void test08test08getAeropuertoDest() throws ExceptionVuelo {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        assertEquals(apDestino, vuelo.getAeropuertoDestino());
        vuelo.clearCodVuelo();
    }

    @Test
    void test09setAeropuertoDest() throws ExceptionVuelo, ExceptionAeropuerto {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        Aeropuerto apDestino2 = new Aeropuerto("IRJ", "La Rioja", "La Rioja", 4360);
        vuelo.setAeropuertoDest(apDestino2);
        assertSame(apDestino2, vuelo.getAeropuertoDestino());
        vuelo.clearCodVuelo();
    }

    @Test
    void test10getAvion() throws ExceptionVuelo {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        assertEquals(avion1, vuelo.getAvion());
        vuelo.clearCodVuelo();
    }

    //    20. Cambiar un avión de un vuelo
    @Test
    void test11setAvion() throws ExceptionAvion, ExceptionVuelo {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        Avion a2 = new Avion("LV-ABB", "modelo2", 150, 2006);
        vuelo.setAvion(a2);
        assertEquals(a2, vuelo.getAvion());
        vuelo.clearCodVuelo();
    }

    @Test
    void test12getTripulacion() throws ExceptionVuelo {
        listaPilotos.add(piloto);
        listaPilotos.add(copiloto);
        List<Piloto> lp = new ArrayList<Piloto>();
        lp.add(piloto);
        lp.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        assertEquals(lp, vuelo.getTripulacion());
        vuelo.clearCodVuelo();
    }

//  Cambiar el comandante de un vuelo
    @Test
    void test13setPiloto() throws ExceptionPiloto, ExceptionVuelo {
        Piloto p2 = new Piloto("30-64140555-4", 1234321, "estrada", "diego", fPiloto, RolTripulacion.PILOTO);
        List<Piloto> listapilotos = new ArrayList<Piloto>();
        listaPilotos.remove(piloto);
        listaPilotos.add(p2);
        listapilotos.add(p2);
        listapilotos.add(copiloto);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        vuelo.setTripulacion(listapilotos);
        vuelo.clearCodVuelo();
    }

//  Cambiar el copiloto de un vuelo
    @Test
    void test14setCoPiloto() throws ExceptionPiloto, ExceptionVuelo {
        Piloto cop2 = new Piloto("30-64140555-4", 1234321, "estrada", "diego", fPiloto, RolTripulacion.COPILOTO);
        List<Piloto> listapilotos = new ArrayList<Piloto>();
        listaPilotos.remove(copiloto);
        listaPilotos.add(cop2);
        listapilotos.add(piloto);
        listapilotos.add(cop2);
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        vuelo.setTripulacion(listapilotos);
        vuelo.clearCodVuelo();
    }
//  Cargar nuevos vuelos
    @Test
    void test15addVuelo() throws ExceptionAerolinea, ExceptionVuelo {
        Vuelo vuelo = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        Vuelo vuelo2 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        Vuelo vuelo3 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        GestorVuelo gestorVuelo = new GestorVuelo();
        gestorVuelo.addVuelo(vuelo);
        assertEquals(1, gestorVuelo.misVuelos.size());
        gestorVuelo.addVuelo(vuelo2);
        gestorVuelo.addVuelo(vuelo3);
        assertEquals(3, gestorVuelo.misVuelos.size());
        vuelo.clearCodVuelo();
    }
//  Buscar vuelos por fecha
    @Test
    void test16buscarVuelosXfecha() throws ExceptionAerolinea, ExceptionVuelo {
        Aerolinea aerolinea2 = new Aerolinea("30-64140555-4", "CL", "Aerolíneas Chile", fAerolinea);
        Aerolinea aerolinea3 = new Aerolinea("30-64140555-4", "UR", "Aerolíneas Uru", fAerolinea);
        GregorianCalendar fecha = new GregorianCalendar(2020, 05, 20);
        GregorianCalendar hSalida2 = new GregorianCalendar(2020, 05, 19, 9, 40);
        Vuelo vuelo = new Vuelo(hSalida2, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
        Vuelo vuelo2 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea2);
        Vuelo vuelo3 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea3);
        GestorVuelo gestorVuelo = new GestorVuelo();
        gestorVuelo.addVuelo(vuelo);
        gestorVuelo.addVuelo(vuelo2);
        gestorVuelo.addVuelo(vuelo3);
        List<Vuelo> lv = new ArrayList<>();
        lv.add(vuelo2);
        lv.add(vuelo3);
        assertEquals(lv, gestorVuelo.buscarVuelosXfecha(fecha));
        vuelo.clearCodVuelo();
    }

//  Buscar vuelos por aerolínea
//    @Test
//    void test17buscarVuelosXAerolinea() throws ExceptionAerolinea, ExceptionVuelo {
//        Aerolinea aerolinea2 = new Aerolinea("30-64140555-4", "CL", "Aerolíneas Chile", fAerolinea);
//        Aerolinea aerolinea3 = new Aerolinea("30-64140555-4", "UR", "Aerolíneas Uru", fAerolinea);
//        GregorianCalendar hSalida2 = new GregorianCalendar(2020, 05, 19, 9, 40);
//        Vuelo vuelo = new Vuelo(hSalida2, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
//        Vuelo vuelo2 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea2);
//        Vuelo vuelo3 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, avion1, listaPilotos, aerolinea);
//        GestorVuelo gestorVuelo = new GestorVuelo();
//        gestorVuelo.addVuelo(vuelo);
//        gestorVuelo.addVuelo(vuelo2);
//        gestorVuelo.addVuelo(vuelo3);
//        List<Vuelo> lv = new ArrayList<>();
//        lv.add(vuelo);
//        lv.add(vuelo3);
//        assertEquals(lv, gestorVuelo.buscarVuelosXaerolnea(aerolinea));
//        vuelo.clearCodVuelo();
//    }

}