package co.unicauca.servidor.repositorios;

import java.util.ArrayList;

import sop_corba.ControladorAlertaIntPackage.AlertaDTO;

public interface AlertaRepositoryInt {
    public boolean crearAlerta(AlertaDTO alerta);

    public ArrayList<AlertaDTO> obtenerListaAlertas();
}
