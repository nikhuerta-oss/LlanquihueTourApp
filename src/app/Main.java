package app;


import model.Guia;
import service.GestorPersonas;
import util.LectorArchivo;



public class Main {


    public static void main(String[] args){


        GestorPersonas gestor = new GestorPersonas();


        for(Guia g :
                LectorArchivo.cargarGuias("datos.csv")){


            gestor.agregarGuia(g);

        }



        System.out.println("LISTADO DE GUIAS");

        gestor.mostrar();



        System.out.println("\nBUSQUEDA:");

        gestor.buscar("Carlos");

    }

}