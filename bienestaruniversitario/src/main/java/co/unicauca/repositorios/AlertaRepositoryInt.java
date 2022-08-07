package co.unicauca.repositorios;

import java.util.ArrayList;

import sop_corba.ControladorAlertaIntPackage.AlertaDTO;

public interface AlertaRepositoryInt {
    public ArrayList<AlertaDTO> obtenerListaAlertas();
}
