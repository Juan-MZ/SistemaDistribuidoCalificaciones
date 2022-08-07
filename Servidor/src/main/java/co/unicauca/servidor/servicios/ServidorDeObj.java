package co.unicauca.servidor.servicios;

import co.unicauca.servidor.controladores.ControladorGestorCalificacionesImpl;
import co.unicauca.servidor.repositorios.AlertaRepository;
import co.unicauca.servidor.utilidades.UtilidadesConsola;
import co.unicauca.servidor.utilidades.UtilidadesRegistroS;

/**
 * Hello world!
 */
public final class ServidorDeObj {
    private ServidorDeObj() {
    }

    public static void main(String[] args) {
        try {
            String[] vectorDatosLocalizarNS = new String[4];// almacena la información para localizar el ns
            vectorDatosLocalizarNS[0] = "-ORBInitialHost";
            System.out.println("Ingrese la dirección IP donde escucha el n_s");
            vectorDatosLocalizarNS[1] = UtilidadesConsola.leerCadena();
            vectorDatosLocalizarNS[2] = "-ORBInitialPort";
            System.out.println("Ingrese el puerto donde escucha el n_s");
            vectorDatosLocalizarNS[3] = UtilidadesConsola.leerCadena();

            AlertaRepository objRepository = new AlertaRepository();
            ControladorGestorCalificacionesImpl objRemotoGestionCalificaciones = new ControladorGestorCalificacionesImpl(
                    objRepository);

            UtilidadesRegistroS.registrarObjetoRemoto(vectorDatosLocalizarNS, objRemotoGestionCalificaciones,
                    "servidor-calificaciones");

        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }
    }
}
