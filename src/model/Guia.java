package model;


public class Guia extends Persona {

    private String especialidad;


    public Guia(String nombre, String rut, String telefono, String especialidad){

        super(nombre,rut,telefono);
        this.especialidad = especialidad;
    }


    public String getEspecialidad(){
        return especialidad;
    }


    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }


    @Override
    public String toString(){

        return super.toString() +
                " | Especialidad: " + especialidad;
    }
}
