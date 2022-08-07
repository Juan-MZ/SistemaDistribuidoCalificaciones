package co.unicauca.servidor.controladores;

import java.rmi.RemoteException;

import co.unicauca.servidor.gestores.gestorAlertas;
import co.unicauca.servidor.repositorios.AlertaRepositoryInt;
import sop_corba.ControladorCalificacionIntPOA;
import sop_corba.ControladorAlertaIntPackage.AlertaDTO;
import sop_corba.ControladorCalificacionIntPackage.CalificacionDTO;
import sop_corba.ControladorCalificacionIntPackage.InformeDTO;

public class ControladorGestorCalificacionesImpl extends ControladorCalificacionIntPOA {

    private final AlertaRepositoryInt objAlertaRepository;

    public ControladorGestorCalificacionesImpl(AlertaRepositoryInt objAlertaRepository)
            throws RemoteException {
        this.objAlertaRepository = objAlertaRepository;
    }

    @Override
    public boolean registrarCalificacion(CalificacionDTO objCalificacion) {
        boolean bandera = false;
        if (objCalificacion.calificacion >= 1.0 && objCalificacion.calificacion < 4.5) {

            AlertaDTO objAlerta = gestorAlertas.comprobarCalificacion(objCalificacion);

            this.objAlertaRepository.crearAlerta(objAlerta);

            bandera = true;
        }
        return bandera;
    }

    @Override
    public InformeDTO obtenerAlertasVerdesCorte() {
        InformeDTO informe = gestorAlertas.obtenerAlertasColorCorte(objAlertaRepository.obtenerListaAlertas(), "verde");
        return informe;
    }

    @Override
    public InformeDTO obtenerAlertasBienestarCorte() {
        InformeDTO informe = gestorAlertas.obtenerAlertasColorCorte(objAlertaRepository.obtenerListaAlertas(), "roja");
        return informe;
    }

    @Override
    public int obtenerAlertasRojas() {
        return gestorAlertas.obtenerAlertasRojas(objAlertaRepository.obtenerListaAlertas());
    }

}
