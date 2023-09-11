
package citasreserva;

public class Cita_Recerva extends Medico{
    private int idCita;
    String HoraCita;
    String FechaCita;

    public Cita_Recerva(int idCita, String HoraCita, String FechaCita, int idMedico, 
            String Cedula, String Nombre, String Apellido, int DNI, String Sexo, int Celular, 
            String Direccion, int idEspecialidad, String NombreEspecialidad) {
        super(idMedico, Cedula, Nombre, Apellido, DNI, Sexo, Celular, Direccion, idEspecialidad, 
                NombreEspecialidad);
        this.idCita = idCita;
        this.HoraCita = HoraCita;
        this.FechaCita = FechaCita;
    }

 
  
}
