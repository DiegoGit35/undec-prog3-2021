import exceptions.ExceptionAeropuerto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AeropuertoTest {
    Aeropuerto a = new Aeropuerto("EZE", "Ezeiza", "Chilecito", 5360);
    Aeropuerto a2 = new Aeropuerto("ALP", "Aeropuerto La Plata", "La Plata", 5132);
    Aeropuerto a3 = new Aeropuerto("ALR", "Aeropuerto La Rioja", "La Rioja", 6421);


//  Cargar un aeropuerto nuevo
    @Test
    void test01addAeropuerto(){
        GestorAeropuerto gestorAeropuerto = new GestorAeropuerto();
        gestorAeropuerto.addAeropuerto(a);
        gestorAeropuerto.addAeropuerto(a2);
        gestorAeropuerto.addAeropuerto(a3);
        gestorAeropuerto.addAeropuerto(a3);
        assertEquals(3, gestorAeropuerto.cantAeropuertos());
    }
//  Buscar aeropuerto por código IATA
    @Test
    void test02buscarAeropuertosXcodIATA(){
        List<Aeropuerto> lista2 = new ArrayList<Aeropuerto>();
        GestorAeropuerto gestorAeropuerto = new GestorAeropuerto();
        gestorAeropuerto.addAeropuerto(a);
        gestorAeropuerto.addAeropuerto(a2);
        gestorAeropuerto.addAeropuerto(a3);
        lista2.add(a2);
        assertEquals(lista2, gestorAeropuerto.buscarXcodIATA("ALP"));
    }

//  Consultar los aeropuertos
    @Test
    void test03getAeropuertos(){
        List<Aeropuerto> lista2 = new ArrayList<Aeropuerto>();
        GestorAeropuerto gestorAeropuerto = new GestorAeropuerto();
        gestorAeropuerto.addAeropuerto(a);
        gestorAeropuerto.addAeropuerto(a2);
        gestorAeropuerto.addAeropuerto(a3);
        lista2.add(a);
        lista2.add(a2);
        lista2.add(a3);
        assertEquals(lista2, gestorAeropuerto.getAeropuertos());
    }
//  Modificar un aeropuerto existente

}