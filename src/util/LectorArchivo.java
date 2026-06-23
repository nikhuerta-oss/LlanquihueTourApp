package util;


import model.Guia;
import java.io.*;
import java.util.ArrayList;


public class LectorArchivo {


    public static ArrayList<Guia> cargarGuias(String archivo){


        ArrayList<Guia> lista = new ArrayList<>();


        try{


            BufferedReader br =
                    new BufferedReader(new FileReader(archivo));


            String linea;


            while((linea = br.readLine()) != null){


                String datos[] = linea.split(",");


                Guia guia = new Guia(
                        datos[0],
                        datos[1],
                        datos[2],
                        datos[3]
                );


                lista.add(guia);

            }


            br.close();



        }catch(IOException e){

            System.out.println("Error leyendo archivo");

        }


        return lista;

    }

}
