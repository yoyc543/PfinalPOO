
package citasreserva;

public class Medico extends Especialidad{
    private int idMedico;
//    private Especialidad idEspecialidad; 
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private int DNI;
    private String Sexo;
    private int Celular;
    private String Direccion;

    public Medico(int idMedico, String Cedula, String Nombre, String Apellido, 
            int DNI, String Sexo, int Celular, String Direccion, int idEspecialidad, 
            String NombreEspecialidad) {
        
        super(idEspecialidad, NombreEspecialidad);
        this.idMedico = idMedico;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Sexo = Sexo;
        this.Celular = Celular;
        this.Direccion = Direccion;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }     
}

   