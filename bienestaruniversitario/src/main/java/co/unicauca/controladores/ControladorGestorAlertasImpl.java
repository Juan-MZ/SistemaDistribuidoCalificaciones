package co.unicauca.controladores;

import java.rmi.RemoteException;

import co.unicauca.repositorios.AlertaRepositoryInt;
import sop_corba.ControladorAlertaIntPOA;
import sop_corba.ControladorAlertaIntPackage.AlertaDTO;

public class ControladorGestorAlertasImpl extends ControladorAlertaIntPOA {

    private final AlertaRepositoryInt objAlertaRepository;

    public ControladorGestorAlertasImpl(AlertaRepositoryInt objAlertaRepository)
            throws RemoteException {
        this.objAlertaRepository = objAlertaRepository;
    }

    @Override
    public boolean enviarAlerta(AlertaDTO objAlerta) {
        if (objAlertaRepository.obtenerListaAlertas().add(objAlerta)) {
            System.out.println("---------------------------");
            System.out.println("nueva alerta (#" + objAlertaRepository.obtenerListaAlertas().size() + ")");
            System.out.println("---------------------------");
            System.out.println("codigo estudiante: " + objAlerta.codigoEstudiante);
            System.out.println("alerta generada en el corte: " + objAlerta.corte);
        }

        return false;
    }

}
