
package citasreserva;

public class Especialidad {
    private int idEspecialidad;
    private String NombreEspecialidad;

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String NombreEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.NombreEspecialidad = NombreEspecialidad;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombreEspecialidad() {
        return NombreEspecialidad;
    }

    public void setNombreEspecialidad(String NombreEspecialidad) {
        this.NombreEspecialidad = NombreEspecialidad;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "idEspecialidad=" + idEspecialidad + 
                ", NombreEspecialidad=" + NombreEspecialidad + '}';
    } 
}
