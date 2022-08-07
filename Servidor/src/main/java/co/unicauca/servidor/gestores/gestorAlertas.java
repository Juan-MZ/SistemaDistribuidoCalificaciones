package co.unicauca.servidor.gestores;

import java.util.List;

import sop_corba.ControladorAlertaIntPackage.AlertaDTO;
import sop_corba.ControladorCalificacionIntPackage.CalificacionDTO;
import sop_corba.ControladorCalificacionIntPackage.InformeDTO;

public class gestorAlertas {
    public static AlertaDTO comprobarCalificacion(CalificacionDTO calificacion) {

        AlertaDTO alerta = new AlertaDTO();

        alerta.codigoEstudiante = calificacion.codigoEstudiante;
        alerta.corte = calificacion.corte;

        if (calificacion.calificacion >= 1.0 && calificacion.calificacion < 3.0) {
            alerta.color = "roja";
            gestorNotificaciones.enviarAlertaEstudiante(alerta, "servidor-bienestar");
        } else if (calificacion.calificacion >= 3.0 && calificacion.calificacion < 3.5) {
            alerta.color = "naranja";
        } else if (calificacion.calificacion >= 3.5 && calificacion.calificacion < 4.5) {
            alerta.color = "verde";
        }

        gestorNotificaciones.enviarAlertaEstudiante(alerta, "servidor-estudiante");

        return alerta;
    }

    public static InformeDTO obtenerAlertasColorCorte(List<AlertaDTO> listaAlertas, String prmColor) {
        InformeDTO informe = new InformeDTO();

        informe.corte1 = 0;
        informe.corte2 = 0;
        informe.corte3 = 0;

        for (int i = 0; i < listaAlertas.size(); i++) {
            if (listaAlertas.get(i).color.equals(prmColor) && listaAlertas.get(i).corte == 1) {
                informe.corte1 = informe.corte1 + 1;
            }
            if (listaAlertas.get(i).color.equals(prmColor) && listaAlertas.get(i).corte == 2) {
                informe.corte2 = informe.corte2 + 1;
            }
            if (listaAlertas.get(i).color.equals(prmColor) && listaAlertas.get(i).corte == 3) {
                informe.corte3 = informe.corte3 + 1;
            }
        }

        return informe;
    }

    public static int obtenerAlertasRojas(List<AlertaDTO> listaAlertas) {
        int alertasRojas = 0;

        for (int i = 0; i < listaAlertas.size(); i++) {
            if (listaAlertas.get(i).color.equals("roja")) {
                alertasRojas = alertasRojas + 1;
            }
        }

        return alertasRojas;
    }

}
