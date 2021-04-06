import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class GestorVuelo {
    public ArrayList<Vuelo> misVuelos = new ArrayList<>();

    public void addVuelo(Vuelo vuelo) {
        boolean bandera = false;
        for(Vuelo v : misVuelos)
            if(v.getCodVuelo().matches(vuelo.getCodVuelo()))
                bandera = true;
        if(bandera == false)
            misVuelos.add(vuelo);
    }

    public List<Vuelo> buscarVuelosXfecha(GregorianCalendar fecha) {
        List<Vuelo> lv = new ArrayList<Vuelo>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for(Vuelo v : misVuelos)
            if(v.getFechaSalida().matches(sdf.format(fecha.getTime())))
                lv.add(v);
        return lv;
    }

    public List<Vuelo> buscarVuelosXaerolnea(Aerolinea aerolinea) {
        List<Vuelo> lv = new ArrayList<>();
        for(Vuelo v : misVuelos)
            if(v.aerolinea.codIATA.matches(aerolinea.codIATA))
                lv.add(v);
        return lv;
    }
    public void clear(){
        misVuelos= new ArrayList<Vuelo>();
    }
}
