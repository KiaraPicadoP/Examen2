
package Pacientes;

import java.util.ArrayList;

public class ListaPacientes extends Paciente{
   ArrayList<Paciente>pacientes;

    public ListaPacientes(ArrayList<Paciente> paciente, int cedula, String nombre, String fecha, String horaLLegada, String horaSalida, String Clasificacion) {
        super(cedula, nombre, fecha, horaLLegada, horaSalida, Clasificacion);
        this.pacientes = new ArrayList<>();
    
    }
    public void agregar(Paciente paciente,String rojo,String amarillo, String verde){
        if(pacientes.contains(rojo)){
           pacientes.add(paciente);
        }else{
            if(pacientes.contains(amarillo)){
                pacientes.add(paciente);  
            }else{
                if(pacientes.contains(verde)){
                    pacientes.add(paciente);
                }
            }
            }
        }
    public String validarAtendido(String horaSalida,String atendido,String espera){
       if(pacientes.contains(atendido)){
           return horaSalida;
       }else{
          return espera; 
       }
    }
    public void busqueda(Paciente paciente){
        for (int i = 0; i < pacientes.size(); i++) {
            if(pacientes.get(i).getCedula()==paciente.getCedula()){
                pacientes.get(i);
            }
        }
       }  
    public void mostrar(){
        for(Paciente p:pacientes){
            System.out.println(p);
    }
   }

    void agregar(Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  }
        
    
    

