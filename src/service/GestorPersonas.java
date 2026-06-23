package service;


import model.Guia;
import java.util.ArrayList;


public class GestorPersonas {


    private ArrayList<Guia> guias;



    public GestorPersonas(){

        guias = new ArrayList<>();

    }



    public void agregarGuia(Guia guia){

        guias.add(guia);

    }



    public void mostrar(){

        for(Guia g: guias){

            System.out.println(g);

        }

    }



    public void buscar(String nombre){


        for(Guia g: guias){


            if(g.getNombre()
                    .equalsIgnoreCase(nombre)){


                System.out.println(g);

            }

        }

    }

}
