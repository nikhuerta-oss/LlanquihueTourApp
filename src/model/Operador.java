package model;


public class Operador extends Persona {


    private String empresa;


    public Operador(String nombre,String rut,String telefono,String empresa){

        super(nombre,rut,telefono);
        this.empresa = empresa;
    }


    public String getEmpresa(){
        return empresa;
    }


    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }


    public String toString(){

        return super.toString()+
                " | Empresa: "+empresa;
    }

}