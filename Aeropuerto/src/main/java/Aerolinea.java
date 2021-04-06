import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class Aerolinea {
    public String cuit;
    public String codIATA;
    public String nombre;
    public GregorianCalendar fecha;

    private List<Avion> misAviones = new ArrayList<>();
    private List<Piloto> misPilotos = new ArrayList<>();

    public Aerolinea(String cuit, String codIATA, String nombre, GregorianCalendar fecha) {
        this.cuit = cuit;
        this.codIATA = codIATA;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Aerolinea() {
    }

    public void addAvion(Avion avion) {
        boolean bandera = false;
        for (Avion a : misAviones)
            if (a.getMatricula().contains(avion.matricula))
                bandera = true;
        if(bandera == false)
            misAviones.add(avion);
    }

    public int cantAviones() {
        return misAviones.size();
    }

    public List<Avion> buscarAvionesxMatriculas(String matricula) {
        List<Avion> salida= new ArrayList<Avion>();
        for (Avion a : misAviones)
            if (a.getMatricula().contains(matricula))
                salida.add(a);
        return salida;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setCodIATA(String codIATA) {
        this.codIATA = codIATA.toUpperCase();
    }

    public String getCodIATA() {
        return codIATA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.fecha.getTime());
    }

    public void setFecha(int anio, int mes, int dia) {
        GregorianCalendar f1 = new GregorianCalendar(anio, mes, dia);
        this.fecha = f1;
    }

    public void addPiloto(Piloto p1) {
        boolean bandera = false;
        for(Piloto p : misPilotos)
            if (p.getCuil().contains(p1.cuil))
                bandera = true;
        if(bandera == false)
            misPilotos.add(p1);
    }

    public int cantPilotos() {
        return misPilotos.size();
    }

    public List<Piloto> getPilotos() {
        return misPilotos;
    }

    public List<Piloto> buscarPilotoxCuil(String cuil) {
        List<Piloto> salida= new ArrayList<>();
        for (Piloto p : misPilotos)
            if (p.getCuil().matches(cuil))
                salida.add(p);
        return salida;
    }

    public List<Piloto> buscarPilotoxApellido(String apellido) {
        List<Piloto> salida= new ArrayList<>();
        for (Piloto p : misPilotos)
            if (p.getApellido().toUpperCase().contains(apellido.toUpperCase()))
                salida.add(p);
        return salida;
    }
}
