package co.unicauca.gestores;

import sop_corba.ControladorCalificacionInt;
import sop_corba.ControladorCalificacionIntPackage.CalificacionDTO;
import sop_corba.ControladorCalificacionIntPackage.InformeDTO;

public class gestorCalificaciones {
    public static boolean enviarCalificacion(ControladorCalificacionInt objRemoto, int codigoEstudiante, String nombre,
            float nota, int corte) {
        CalificacionDTO calificacion = new CalificacionDTO();

        calificacion.codigoEstudiante = codigoEstudiante;
        calificacion.nombreEstudiante = nombre;
        calificacion.calificacion = nota;
        calificacion.corte = corte;

        return objRemoto.registrarCalificacion(calificacion);
    }

    public static void presentarInformes(ControladorCalificacionInt objRemoto) {
        InformeDTO alertasAux;

        // invocacion de alertas rojas
        System.out.println("Numero de alertas rojas totales: " + objRemoto.obtenerAlertasRojas());

        // invocacion de informe alertas bienestar por corte
        alertasAux = objRemoto.obtenerAlertasBienestarCorte();

        System.out.println("------------------------------------------------");
        System.out.println("# Alertas reportadas a bienestar por corte");
        System.out.println("------------------------------------------------");
        System.out.println("primer corte: " + alertasAux.corte1 + " alerta(s)");
        System.out.println("segundo corte: " + alertasAux.corte2 + " alerta(s)");
        System.out.println("tercer corte: " + alertasAux.corte3 + " alerta(s)");

        // invocacion de informe de alertas verdes por corte
        alertasAux = objRemoto.obtenerAlertasVerdesCorte();

        System.out.println("------------------------------------------------");
        System.out.println("# Alertas verdes reportadas por corte");
        System.out.println("------------------------------------------------");
        System.out.println("primer corte: " + alertasAux.corte1 + " alerta(s)");
        System.out.println("segundo corte: " + alertasAux.corte2 + " alerta(s)");
        System.out.println("tercer corte: " + alertasAux.corte3 + " alerta(s)");
    }

    public static void quemarCalificaciones(ControladorCalificacionInt objRemoto) {
        // Corte 1
        gestorCalificaciones.enviarCalificacion(objRemoto, 12, "Juan", (float) 2.4, 1);
        gestorCalificaciones.enviarCalificacion(objRemoto, 15, "Oscar", (float) 3.4, 1);
        gestorCalificaciones.enviarCalificacion(objRemoto, 16, "Pedro", (float) 3.2, 1);
        gestorCalificaciones.enviarCalificacion(objRemoto, 15, "Erika", (float) 4.2, 1);
        gestorCalificaciones.enviarCalificacion(objRemoto, 16, "Daniel", (float) 4.4, 1);
        gestorCalificaciones.enviarCalificacion(objRemoto, 17, "Sebas", (float) 4.3, 1);

        // Corte 2
        gestorCalificaciones.enviarCalificacion(objRemoto, 13, "Pablo", (float) 1.8, 2);
        gestorCalificaciones.enviarCalificacion(objRemoto, 17, "Yazmin", (float) 3.3, 2);
        gestorCalificaciones.enviarCalificacion(objRemoto, 15, "Carlos", (float) 3.7, 2);
        gestorCalificaciones.enviarCalificacion(objRemoto, 16, "Sofia", (float) 3.9, 2);

        // Corte 3
        gestorCalificaciones.enviarCalificacion(objRemoto, 14, "Sara", (float) 2.6, 3);
        gestorCalificaciones.enviarCalificacion(objRemoto, 18, "Nicolas", (float) 3.1, 3);
        gestorCalificaciones.enviarCalificacion(objRemoto, 17, "Samuel", (float) 3.9, 3);
    }
}
