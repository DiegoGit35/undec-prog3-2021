
public class Avion {
    String matricula;
    String modelo;
    int capacidad;
    int anio;
    public Avion(String matricula, String modelo, int capacidad, int anio) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.anio = anio;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAnioFab() {
        return anio;
    }

    public void setAnioFab(int i) {
        this.anio = anio;
    }
}
