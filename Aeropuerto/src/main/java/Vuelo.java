import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class Vuelo {
    public Aerolinea aerolinea;
    public String codVuelo;
    public GregorianCalendar horaSalida;
    public GregorianCalendar horaLlegada;
    public Aeropuerto aeropuertoSalida;
    public Aeropuerto aeropuertoDestino;
    public Avion avion;
    public List<Piloto> listaPilotos;
    public static int n = 0;

    public Vuelo(GregorianCalendar horaSalida, GregorianCalendar horaLlegada, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoDestino, Avion avion, List<Piloto> listaPilotos, Aerolinea aerolinea) {
        this.horaSalida = horaSalida;
        this.codVuelo = aerolinea.codIATA.toUpperCase() + " " + LPAD(String.valueOf(++n), 4, "0");
        this.horaLlegada = horaLlegada;
        this.aeropuertoSalida = aeropuertoSalida;
        this.aeropuertoDestino = aeropuertoDestino;
        this.avion = avion;
        this.listaPilotos = listaPilotos;
    }

    public void clearCodVuelo() {
        n=0;
    }


    public static String LPAD(String cadena, int cantDigitos, String caracter) {
        String salida=cadena;
        for (int i = 1; i <= cantDigitos-cadena.length(); i++)
            salida=caracter+salida;
        return salida;
    }

    public String getHoraSalida() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(this.horaSalida.getTime());
    }

    public String getHoraArribo() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(this.horaLlegada.getTime());
    }

    public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public Aeropuerto getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public void setHoraSalida(int anio, int mes, int dia, int hora, int minuto) {
        this.horaSalida.set(Calendar.YEAR, anio);
        this.horaSalida.set(Calendar.MONTH, mes);
        this.horaSalida.set(Calendar.DAY_OF_MONTH, dia);
        this.horaSalida.set(Calendar.HOUR, hora);
        this.horaSalida.set(Calendar.MINUTE, minuto);
    }

    public void setHoraArribo(int anio, int mes, int dia, int hora, int minuto) {
        this.horaLlegada.set(Calendar.YEAR, anio);
        this.horaLlegada.set(Calendar.MONTH, mes);
        this.horaLlegada.set(Calendar.DAY_OF_MONTH, dia);
        this.horaLlegada.set(Calendar.HOUR, hora);
        this.horaLlegada.set(Calendar.MINUTE, minuto);
    }

    public void setAeropuertoSalida(Aeropuerto apSalida2) {
        this.aeropuertoSalida = apSalida2;
    }

    public void setAeropuertoDest(Aeropuerto apDestino2) {
        this.aeropuertoDestino = apDestino2;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public List<Piloto> getTripulacion() {
        return listaPilotos;
    }

    public void setTripulacion(List<Piloto> lp) {
        this.listaPilotos = lp;
    }

    public String getFechaSalida() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.horaSalida.getTime());
    }

    public String getCodVuelo() {
        return codVuelo;
    }
}
