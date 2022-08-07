package co.unicauca.servicios;

import co.unicauca.utilidades.UtilidadesRegistroC;
import sop_corba.ControladorCalificacionInt;
import co.unicauca.gestores.gestorCalificaciones;

/**
 * Hello world!
 */
public final class ClienteDeObj {

    private ClienteDeObj() {
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */

    private static ControladorCalificacionInt objRemoto;

    public static void main(String[] args) {

        String[] vectorDatosLocalizarNS = new String[4];
        vectorDatosLocalizarNS[0] = "-ORBInitialHost";
        vectorDatosLocalizarNS[1] = "localhost";
        vectorDatosLocalizarNS[2] = "-ORBInitialPort";
        vectorDatosLocalizarNS[3] = "2020";

        objRemoto = UtilidadesRegistroC.obtenerObjRemoto(vectorDatosLocalizarNS, "servidor-calificaciones");

        System.out.println("Cliente conectado al  servidor a través de la ip y puerto " + vectorDatosLocalizarNS[1]
                + ":" + vectorDatosLocalizarNS[3]);

        gestorCalificaciones.quemarCalificaciones(objRemoto);
        System.out.println("Datos quemados");

        System.out.println("INFORME");
        gestorCalificaciones.presentarInformes(objRemoto);

    }
}
