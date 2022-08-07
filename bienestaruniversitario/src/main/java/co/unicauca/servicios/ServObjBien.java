package co.unicauca.servicios;

import co.unicauca.controladores.ControladorGestorAlertasImpl;
import co.unicauca.repositorios.AlertaRepository;
import co.unicauca.utilidades.UtilidadesRegistroS;

/**
 * Hello world!
 */
public final class ServObjBien {
    private ServObjBien() {
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        try {
            String[] vectorDatosLocalizarNS = new String[4];// almacena la información para localizar el ns
            vectorDatosLocalizarNS[0] = "-ORBInitialHost";
            vectorDatosLocalizarNS[1] = "localhost";// ip por donde escucha el n_s
            vectorDatosLocalizarNS[2] = "-ORBInitialPort";
            vectorDatosLocalizarNS[3] = "2020";// puerto por donde escucha el n_s

            AlertaRepository objRepository = new AlertaRepository();
            ControladorGestorAlertasImpl objRemotoGestionCalificaciones = new ControladorGestorAlertasImpl(
                    objRepository);

            UtilidadesRegistroS.registrarObjetoRemoto(vectorDatosLocalizarNS, objRemotoGestionCalificaciones,
                    "servidor-bienestar");
            System.out.println("En el puerto e ip " + vectorDatosLocalizarNS[1] + ":" + vectorDatosLocalizarNS[3]);

        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }
    }
}
