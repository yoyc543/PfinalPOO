
package citasreserva;
public class Consultorio extends Medico{
      private int idConsultorio;
      private String nombreConsultorio;

    public Consultorio(int idConsultorio, String nombreConsultorio, int idMedico, 
            String Cedula, String Nombre, String Apellido, int DNI, String Sexo, int Celular, 
            String Direccion, int idEspecialidad, String NombreEspecialidad) {
        super(idMedico, Cedula, Nombre, Apellido, DNI, Sexo, Celular, Direccion, idEspecialidad, 
                NombreEspecialidad);
        
        this.idConsultorio = idConsultorio;
        this.nombreConsultorio = nombreConsultorio;
    }

    public int getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(int idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public String getNombreConsultorio() {
        return nombreConsultorio;
    }

    public void setNombreConsultorio(String nombreConsultorio) {
        this.nombreConsultorio = nombreConsultorio;
    }    
}


