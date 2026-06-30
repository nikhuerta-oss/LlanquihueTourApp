package data;

import model.*;

public class GestorServicios {


    public void crearServicios() {


        RutaGastronomica ruta1 =
                new RutaGastronomica(
                        "Ruta de sabores del sur",
                        5,
                        4
                );

        RutaGastronomica ruta2 =
                new RutaGastronomica(
                        "Ruta gastronómica Llanquihue",
                        3,
                        6
                );


        PaseoLacustre paseo1 =
                new PaseoLacustre(
                        "Paseo por el lago",
                        2,
                        "Lancha"
                );


        PaseoLacustre paseo2 =
                new PaseoLacustre(
                        "Navegación turística",
                        4,
                        "Catamarán"
                );


        ExcursionCultural excursion1 =
                new ExcursionCultural(
                        "Historia de Puerto Varas",
                        3,
                        "Museo Colonial"
                );


        ExcursionCultural excursion2 =
                new ExcursionCultural(
                        "Recorrido cultural",
                        5,
                        "Iglesia antigua"
                );


        System.out.println(ruta1);
        System.out.println(ruta2);

        System.out.println(paseo1);
        System.out.println(paseo2);

        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}