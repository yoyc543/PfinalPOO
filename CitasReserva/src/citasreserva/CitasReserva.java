/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package citasreserva;

/**
 *
 * @author christian
 */
public class CitasReserva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   
//        System.out.println("hello word");
    Especialidad especialidad1 = new Especialidad(1,"Cardiologia");
    Medico medico1= new Medico(1,especialidad1, "cedula1", "Luis", 
            "Rojas", 54697812, "Masculino", 978375159, "S/N");

        System.out.println( medico1.toString());
    }
    
    
}
