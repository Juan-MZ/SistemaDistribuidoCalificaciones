package co.unicauca.servidor.gestores;

import co.unicauca.servidor.utilidades.UtilidadesRegistroC;
import sop_corba.ControladorAlertaInt;
import sop_corba.ControladorAlertaIntPackage.AlertaDTO;

public class gestorNotificaciones {
    private static ControladorAlertaInt objRemoto;
    private static String[] vectorDatosLocalizarNS;

    public static boolean enviarAlertaEstudiante(AlertaDTO objAlerta, String idObjRemoto) {

        boolean bandera = false;

        vectorDatosLocalizarNS = new String[4];
        vectorDatosLocalizarNS[0] = "-ORBInitialHost";
        vectorDatosLocalizarNS[1] = "localhost";
        vectorDatosLocalizarNS[2] = "-ORBInitialPort";
        vectorDatosLocalizarNS[3] = "2020";

        objRemoto = UtilidadesRegistroC.obtenerObjRemoto(vectorDatosLocalizarNS,
                idObjRemoto);

        if (objRemoto.enviarAlerta(objAlerta)) {
            System.out.println("Alerta enviada a " + idObjRemoto + " a traves de " + vectorDatosLocalizarNS[1] + ":"
                    + vectorDatosLocalizarNS[3]);
            bandera = true;
        }

        return bandera;
    }

}
