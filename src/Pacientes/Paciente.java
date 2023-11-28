
package Pacientes;

public class Paciente {
  private int cedula;
 private String nombre;
 private String fecha;
 private String horaLLegada;
 private String horaSalida;
 private String Clasificacion;
    public Paciente(int cedula, String nombre, String fecha, String horaLLegada, String horaSalida, String Clasificacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
        this.Clasificacion = Clasificacion;
    }

    public int getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getFecha() {
        return fecha;
    }
    public String getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(String horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }
   

    @Override
    public String toString() {
        return "Paciente{" + "cedula=" + cedula + ", nombre=" + nombre + ", fecha=" + fecha + ", horaLLegada=" + horaLLegada + ", horaSalida=" + horaSalida + ", Clasificacion=" + Clasificacion + '}';
    }
    

}
